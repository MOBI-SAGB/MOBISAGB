package com.sagb.mobisagb.insemination;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.sagb.mobisagb.R;
import com.sagb.mobisagb.db.App;
import com.sagb.model.CertInsemArt;
import com.sagb.model.CertInsemArtDao;
import com.sagb.model.DetCertInsemArt;

import org.greenrobot.greendao.query.WhereCondition;
import org.joda.time.DateTime;

import java.util.List;

import static com.sagb.mobisagb.R.id.dateCertIA;
import static com.sagb.mobisagb.db.App.getDaoSession;

/**
 * Created by USER on 07/11/16.
 */

public class InsemArtificiel_Det  extends Fragment implements View.OnClickListener {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
    private  String date="";
    private  TextView dateCertIA_tv;
    private Spinner numCertIA_sp;
    private Spinner modeReglement_sp;
    private ListView listDetCertIA_lv;
    private FloatingActionButton nextIA_btn;

    public final static String CODE_OPER = "CODE_OPER";
    public final static String CODE_UP = "CODE_UP";
    public final static String CURRENT_CERT_IA = "CURRENT_CERT_IA";
    public final static String IS_OLD_CERT_IA = "IS_NEW_CERT_IA";

    private InsemArtificiel_Init.OnFragmentInteractionListener mListener;


    private static   Context context;


    private static InsemArtificiel_Det fragment =null;

    public InsemArtificiel_Det() {
    }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static InsemArtificiel_Det newInstance(Context context) {

            if (fragment == null){
                fragment = new InsemArtificiel_Det();
            }

            InsemArtificiel_Det.context = context;

            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_insem_artificiel_det, container, false);

            initViews(rootView);

            initListDetCertInsemArt();

            initListNumCertIA();

            initListmodeReglement();

            setNumCertIAListenner();



            return rootView;

        }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.dateCertIA: setDateOnclick();
                break;
            case R.id.nextIA_btn:ouiNonDialogAffiche();
                break;
        }
    }
    public static  InsemArtificiel_Det getInstance(){
        return fragment;
    }

    public void ouiNonDialogAffiche(){

        Command yesCommand = new Command() {

            public void execute() {

                mListener.onFragmentInteraction(InsemArtificielActivity.INTERACTION_NEXT_PAGE,0,useSelectedCertificat(true));
            }

            public void executeNegative() {

                mListener.onFragmentInteraction(InsemArtificielActivity.INTERACTION_NEXT_PAGE,0,useSelectedCertificat(false));

            }
        };

        yesCommand.displayYesNoDialog(context,R.string.continue_with_numCertIA);

    }

    public CertInsemArt useSelectedCertificat(boolean choix){
        CertInsemArt certInsemArt = new CertInsemArt();

        if(choix){
             certInsemArt = (CertInsemArt)numCertIA_sp.getSelectedItem();
            certInsemArt.setDateInsem(DateTime.parse(dateCertIA_tv.getText().toString(),DateTimeConverter.SIMPLE_DATE_FORMATTER));
            certInsemArt.setId_Regl(modeReglement_sp.getSelectedItemPosition());
            return certInsemArt;
        }else{
            long num = GetNumCertIA();
            certInsemArt.setCodeOper(getArguments().getLong(CODE_OPER));
            certInsemArt.setCodeOper(getArguments().getLong(CODE_OPER));
            certInsemArt.setCodeUP(getArguments().getLong(CODE_UP));
            certInsemArt.setDateInsem(DateTime.parse(dateCertIA_tv.getText().toString(),DateTimeConverter.SIMPLE_DATE_FORMATTER));
            certInsemArt.setId_CertIA(num);
            certInsemArt.setNumCertIA(num+"");
            certInsemArt.setId_Regl(modeReglement_sp.getSelectedItemPosition());
            return certInsemArt;
        }


        //    Log.i("NUM CERT GENERE :",""+GetNumCertIA());


       // mListener.onFragmentInteraction(InsemArtificielActivity.INTERACTION_NEXT_PAGE,1L);

    }

    public CertInsemArt certInsemArtExist(long numCert){
        CertInsemArt certInsemArt = App.getDaoSession(context).getCertInsemArtDao().queryBuilder().where(CertInsemArtDao.Properties.Id_CertIA.like(numCert+"")).unique();
        return  certInsemArt;
    }

    public long GetNumCertIA() {

        long NumSess =0;

        NumSess = (dateCertIA_tv.getText().hashCode()+(getArguments().getLong(CODE_OPER)) * 100) + 1;

        //CertInsemArt certInsemArt = App.getDaoSession(context).getCertInsemArtDao().queryBuilder().where(CertInsemArtDao.Properties.Id_CertIA.like(NumSess+"")).unique();
        CertInsemArt certInsemArt = App.getDaoSession(context).getCertInsemArtDao().queryBuilder().where(
                new WhereCondition.StringCondition("Id_CertIA=(SELECT MAX(Id_CertIA) FROM CertInsemArt)")).build().unique();

        if (certInsemArt !=null){

           NumSess = certInsemArt.getId_CertIA()+1;

       }
        /*  HLitRecherchePremier(CertInsemArt, Id_CertIA, NumSess)
        SI HTrouve (CertInsemArt) ALORS
        REQ_GetMaxCertIA.Par_CodeOper = CodeOperateur
        HExécuteRequête(REQ_GetMaxCertIA)
        HLitPremier(REQ_GetMaxCertIA)

        NumSess = Val(REQ_GetMaxCertIA.le_maximum_Id_CertIA)
        NumSess += 1

        FIN*/

        return Math.abs(NumSess);
    }


    /*
     * instantiate  views from  view within layout "fragment_insem_artificiel_det"
     */
    public  void  initViews(View rootView){
        dateCertIA_tv  = (TextView) rootView.findViewById(dateCertIA);
        numCertIA_sp = (Spinner) rootView.findViewById(R.id.NumCertIA_sp);
        modeReglement_sp = (Spinner) rootView.findViewById(R.id.modeReglement_sp);
        listDetCertIA_lv = (ListView) rootView.findViewById(R.id.DetIA_lv);
        nextIA_btn = (FloatingActionButton) rootView.findViewById(R.id.nextIA_btn);

       // igb_atv.addTextChangedListener(this);
        dateCertIA_tv.setOnClickListener(this);
        dateCertIA_tv.setText(new DateTime().toString(DateTimeConverter.SIMPLE_DATE_FORMATTER));
        nextIA_btn.setOnClickListener(this);

    }


    /*
     * affiche list de Details de Certificat d'insemination artificiel
     * dans une list
     */
    public void initListDetCertInsemArt(){

        List<DetCertInsemArt> listDetCertInsemArt = getDaoSession(getActivity()).getDetCertInsemArtDao().loadAll();
        listDetCertIA_lv.setAdapter(new SemenceListAdapter(context,listDetCertInsemArt));
    }

    /*
     * affiche les numeros de certificat
     * dans un Spinner
     * from datanbase
     */
    public void initListNumCertIA(){

        String codeUP = String.valueOf(getArguments().getLong(CODE_UP));
        String codeOp = String.valueOf(getArguments().getLong(CODE_OPER));
        List<CertInsemArt> numCertIAList = getDaoSession(getActivity()).getCertInsemArtDao().queryRaw("WHERE CodeUP = ? AND CodeOper = ?",codeUP,codeOp);
        ArrayAdapter<CertInsemArt> dataAdapter = new ArrayAdapter<CertInsemArt>(getActivity(),android.R.layout.simple_dropdown_item_1line, numCertIAList);
        numCertIA_sp.setAdapter(dataAdapter);

    }

    /*
     * affiche les Mode de reglement
     * dans un Spinner
     * from array resource
     */
    public void initListmodeReglement(){

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InsemArtificiel_Det.context,
                R.array.mode_reg_array,  android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        modeReglement_sp.setAdapter(adapter);

    }


    public void setNumCertIAListenner(){


        numCertIA_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                CertInsemArt certInsemArt = (CertInsemArt)adapterView.getSelectedItem();

                modeReglement_sp.setSelection(certInsemArt.getId_Regl());
                dateCertIA_tv.setText(certInsemArt.getDateInsem().toString(DateTimeConverter.SIMPLE_DATE_FORMATTER));

                onNumCertIASelected(certInsemArt.getId_CertIA());

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    /*
     * set click event onn field : dateCertIA_tv
     * to show datePicker dialog
     */
    public  void setDateOnclick() {


                final Dialog dialog =  new Dialog(context);

                dialog.setContentView(R.layout.calendar);
                CalendarView cal=(CalendarView)dialog.findViewById(R.id.calendarView1);
                Button pickDate=(Button)dialog.findViewById(R.id.pickDateTime);
                pickDate.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        dateCertIA_tv.setText(date);
                        dialog.dismiss();

                    }
                });
                cal.setHorizontalScrollBarEnabled(true);
                cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

                    @Override
                    public void onSelectedDayChange(CalendarView view, int year, int month,int dayOfMonth) {

                        date= year +"-"+ ((month<10)?"0"+month:month) +"-"+ ((dayOfMonth<10)?"0"+dayOfMonth:dayOfMonth);

                    }
                });

                dialog.show();




    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onNumCertIASelected(long uri) {

        Log.i("onNumCertIASelected  :",""+uri);

        if (mListener != null) {
            mListener.onFragmentInteraction(InsemArtificielActivity.INTERACTION_UPDATE_DETAILS_CERT,uri,null);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (InsemArtificiel_Init.OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


}
