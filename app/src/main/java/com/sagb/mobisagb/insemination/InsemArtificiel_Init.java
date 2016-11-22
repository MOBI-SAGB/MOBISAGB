package com.sagb.mobisagb.insemination;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.sagb.mobisagb.R;
import com.sagb.mobisagb.db.App;
import com.sagb.model.CertInsemArt;
import com.sagb.model.DetCertInsemArt;
import com.sagb.model.DetCertInsemArtDao;
import com.sagb.model.Semence;
import com.sagb.model.Troupeau;
import com.sagb.model.TroupeauDao;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;
import static com.sagb.mobisagb.db.App.getDaoSession;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InsemArtificiel_Init.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InsemArtificiel_Init#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InsemArtificiel_Init extends Fragment implements View.OnClickListener{

    private OnFragmentInteractionListener mListener;
    private FloatingActionButton refreshIA_Btn ;
    private Troupeau animal;
    private String date="";

    private Spinner taureau_sp;
    private AutoCompleteTextView igb_atv;
    private AutoCompleteTextView snit_atv;
    private CharSequence userInput;

    private CertInsemArt certIA;

    String snit_igb;

    static Handler mainHandler ;

    private static Context context;
    private Spinner chaleur_sp;
    private Spinner motif_sp;
    private Spinner ordreIA_sp;
    private Bundle args;
    private ListView tableIA_lv;
    private  static InsemArtificiel_Init fragment;
    private FloatingActionButton previous_Btn;
    private Button cutDetCert_btn;



    public InsemArtificiel_Init() {
        // Required empty public constructor
    }

    public static InsemArtificiel_Init newInstance(Context ctx) {

       if(fragment==null) {
           fragment = new InsemArtificiel_Init();

           context = ctx;
           mainHandler = new Handler(context.getMainLooper());
       }
        return fragment;
    }

    public void setCertIA(CertInsemArt certIA){
        this.certIA = certIA;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_insem_artificiel__init, container, false);


        args= getArguments();


        initViews(rootView);

      long num = (args!=null)?args.getLong(ArticleFragment.ARG_POSITION):0;

        initTableIA(num);

        initSemence();

        initIGB();

        initSnit();

        initListChal();

        initstLiMotif();

        initListOrdre();

        return rootView;

    }

    public  void  initViews(View rootView){

        taureau_sp = (Spinner) rootView.findViewById(R.id.taureau_sp);
        igb_atv = (AutoCompleteTextView) rootView.findViewById(R.id.IGB_et) ;
        snit_atv = (AutoCompleteTextView) rootView.findViewById(R.id.SNIT_et) ;
        chaleur_sp = (Spinner) rootView.findViewById(R.id.Chaleur_sp) ;
        motif_sp = (Spinner) rootView.findViewById(R.id.Motif_sp) ;
        ordreIA_sp = (Spinner) rootView.findViewById(R.id.OrdreIA_sp) ;
        tableIA_lv = (ListView) rootView.findViewById(R.id.TableIA_lv) ;
        registerForContextMenu(tableIA_lv);

        // igb_atv.addTextChangedListener(this);

        igb_atv.setAdapter(new ArrayAdapter<Troupeau>(context, android.R.layout.simple_dropdown_item_1line,new ArrayList<Troupeau>()));
        snit_atv.setAdapter(new ArrayAdapter<Troupeau>(context, android.R.layout.expandable_list_content,new ArrayList<Troupeau>()));
        refreshIA_Btn = (FloatingActionButton) rootView.findViewById(R.id.refreshIA_Btn);
        previous_Btn = (FloatingActionButton) rootView.findViewById(R.id.previous_Btn);


        refreshIA_Btn.setOnClickListener(this);
        previous_Btn.setOnClickListener(this);

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v.getId()  == R.id.TableIA_lv) {
            MenuInflater inflater = ((Activity)context).getMenuInflater();
            inflater.inflate(R.menu.activity_tarvel_actions, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = ( AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch(item.getItemId()) {
            case R.id.action_add_travel:
                // add stuff here
                fichierVersEcran((DetCertInsemArt)tableIA_lv.getSelectedItem());
                return true;
            case R.id.action_show_travels:
                // edit stuff here
                return true;
            case R.id.action_edit_travel:
                // remove stuff here
                ouiNonSupprimerDetCert();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }


    public void fichierVersEcran(DetCertInsemArt detCertInsemArt){

        if(detCertInsemArt!=null){

            taureau_sp.setSelection(((ArrayAdapter<Semence>)taureau_sp.getAdapter()).getPosition(detCertInsemArt.getSemence()));
            igb_atv.setText(detCertInsemArt.getAnimal().getNni_bovin());
            snit_atv.setText(detCertInsemArt.getAnimal().getNV_NNI());
            chaleur_sp.setSelection(((ArrayAdapter<String>)taureau_sp.getAdapter()).getPosition(detCertInsemArt.getSignChal()));
            motif_sp.setSelection(((ArrayAdapter<String>)motif_sp.getAdapter()).getPosition(detCertInsemArt.getMotifReset()));
            ordreIA_sp.setSelection(((ArrayAdapter<String>)ordreIA_sp.getAdapter()).getPosition(detCertInsemArt.getOrdreIA()));

        }

    }
    public void initTableIA(Long numCertIA){


        List<DetCertInsemArt> list = App.getDaoSession(context).getDetCertInsemArtDao().queryBuilder().where(DetCertInsemArtDao.Properties.Id_CertIA.like(String.valueOf(numCertIA))).list();


        tableIA_lv.setAdapter(new DetCertIAListAdapter(context,null));


    }
    public void updateTableIA(Long numCertIA){

        List<DetCertInsemArt> list = App.getDaoSession(context).getDetCertInsemArtDao().queryBuilder().where(DetCertInsemArtDao.Properties.Id_CertIA.like(String.valueOf(numCertIA))).list();


        ((DetCertIAListAdapter) tableIA_lv.getAdapter()).setListDetCertIA(list);

        ((DetCertIAListAdapter)tableIA_lv.getAdapter()).notifyDataSetChanged();

    }

    public void initListChal(){

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context,
                R.array.chaleur_array,  android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        chaleur_sp.setAdapter(adapter);

    }
    public void initstLiMotif(){

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context,
                R.array.motif_reset_array,  android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        motif_sp.setAdapter(adapter);

    }
    public void initListOrdre(){

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context,
                R.array.ordre_array,  android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ordreIA_sp.setAdapter(adapter);

    }
    public void  initSnit(){

        snit_atv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                animal = ((Troupeau)adapterView.getAdapter().getItem(i));
                Log.i("tr selected : ",animal.toString());
                snit_atv.setText(animal.getNV_NNI());
                igb_atv.setText(animal.getNni_bovin());

            }
        });

        snit_atv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence userInput, int i, int i1, int i2) {

                snit_igb = userInput.toString();

                if(snit_igb.length()<4)
                    return;

                Runnable r =new Runnable() {
                    @Override
                    public void run() {

                        List<Troupeau> troupeaus = getDaoSession(context).getTroupeauDao().queryBuilder().where(TroupeauDao.Properties.NV_NNI.like("%"+  snit_igb)).list();

                        ArrayAdapter<Troupeau> myAdapter = new ArrayAdapter<Troupeau>(context, android.R.layout.simple_dropdown_item_1line,troupeaus);
                        Log.i(TAG, "SIZE input: " + troupeaus.size());
                        snit_atv.setAdapter(myAdapter);
                        ((ArrayAdapter<String>)snit_atv.getAdapter()).notifyDataSetChanged();
                    }
                };

                mainHandler.post(r);

            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

    }


    public void initSemence(){

        List<Semence> ListSemence = getDaoSession(getActivity()).getSemenceDao().loadAll();
        ArrayAdapter<Semence> dataAdapter = new ArrayAdapter<Semence>(getActivity(),android.R.layout.simple_dropdown_item_1line, ListSemence);
        taureau_sp.setAdapter(dataAdapter);

    }

    public void initIGB(){

        igb_atv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                animal = ((Troupeau)adapterView.getAdapter().getItem(i));
                Log.i("tr selected : ",animal.toString());
                snit_atv.setText(animal.getNV_NNI());
                igb_atv.setText(animal.getNni_bovin());
            }
        });


        igb_atv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence userInput, int i, int i1, int i2) {

                snit_igb = userInput.toString();

                if(snit_igb.length()<4)
                    return;

                Runnable r =new Runnable() {
                    @Override
                    public void run() {

                        List<Troupeau> troupeaus = getDaoSession(context).getTroupeauDao().queryBuilder().where(TroupeauDao.Properties.Nni_bovin.like("%"+snit_igb.toString())).list();

                        ArrayAdapter<Troupeau> myAdapter = new ArrayAdapter<Troupeau>(context, android.R.layout.simple_dropdown_item_1line,troupeaus);
                        Log.i(TAG, "SIZE input: " + troupeaus.size());
                        igb_atv.setAdapter(myAdapter);
                        ((ArrayAdapter<String>)igb_atv.getAdapter()).notifyDataSetChanged();

                    }
                };

                mainHandler.post(r);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

    }

    public void setSaveBtn(){





               // if(App.getDaoSession(context).getCertInsemArtDao().load(certIA.getId_CertIA())==null){
                     App.getDaoSession(context).getCertInsemArtDao().save(certIA);


                String msg = "Id_Animal: "+animal.getId_animal()+
                        "Id_CertIA: "+certIA.getId_CertIA()+
                        "Id_Semence : "+((Semence)taureau_sp.getSelectedItem()).getId_Semence()+
                        "SignChal : "  + chaleur_sp.getId()+
                        "PrixSem : "   +
                        "Motif_Reset : " + motif_sp.getId()+
                        "OrdreIA :  " + ordreIA_sp.getSelectedItem();

                DetCertInsemArt detCertInsemArt= new DetCertInsemArt();

                detCertInsemArt.setId_CertIA(certIA.getId_CertIA());
                detCertInsemArt.setAnimal(animal);
                detCertInsemArt.setSemence(((Semence)taureau_sp.getSelectedItem()));
                detCertInsemArt.setSignChal((String)chaleur_sp.getSelectedItem());
                detCertInsemArt.setMotifReset((String) motif_sp.getSelectedItem());
                detCertInsemArt.setOrdreIA((String) ordreIA_sp.getSelectedItem());

                Log.i("ID INSERT : ",detCertInsemArt.getId_DetCertIA()+"");
                Toast.makeText(context,detCertInsemArt.getId_DetCertIA()+" = ID",Toast.LENGTH_SHORT).show();

                try {

                    App.getDaoSession(context).getDetCertInsemArtDao().insert(detCertInsemArt);

                    onButtonPressed(0);

                    Toast.makeText(context,"detCertInsemArt Saved",Toast.LENGTH_SHORT).show();

                }catch (Exception ex){
                    Log.e("ERROR INSERT",ex.getMessage());
                    Log.e("ID WITH ERROR: ",""+detCertInsemArt.getId_DetCertIA());
                }



    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(int uri) {
        if (mListener != null) {
            long num = (args!=null)?args.getLong(ArticleFragment.ARG_POSITION):0;
            initTableIA(num);
            mListener.onFragmentInteraction(InsemArtificielActivity.INTERACTION_UPDATE_LIST_CERT_IA,uri,null);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
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

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.nextIA_btn :
                        setSaveBtn();
                        break;

            case R.id.previous_Btn :
                      mListener.onFragmentInteraction(InsemArtificielActivity.INTERACTION_PREV_PAGE,0,null);
                      break;
//            case R.id.cutDetCert_btn :
//
//                ouiNonSupprimerDetCert();
//
//                break;

        }

    }

    public void ouiNonSupprimerDetCert(){

        Command cmd = new Command() {

            @Override
            public void execute() {
                App.getDaoSession(context).getDetCertInsemArtDao().delete((DetCertInsemArt)tableIA_lv.getSelectedItem());
                ((DetCertIAListAdapter)tableIA_lv.getAdapter()).remove((DetCertInsemArt)tableIA_lv.getSelectedItem());
            }
            @Override
            public void executeNegative() {}

        };
        cmd.displayYesNoDialog(context,R.string.question_del_detCertIA);

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(int action,long numCertIA,CertInsemArt certInsemArt);
    }
}
