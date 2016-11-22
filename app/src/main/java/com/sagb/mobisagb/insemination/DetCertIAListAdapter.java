package com.sagb.mobisagb.insemination;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sagb.mobisagb.R;
import com.sagb.model.DetCertInsemArt;
import com.sagb.model.TarifSemence;

import java.util.List;

/**
 * Created by USER on 08/11/16.
 */

public class DetCertIAListAdapter extends ArrayAdapter<DetCertInsemArt> {

    private Context context;
   // DetCertInsemArtDao semenceDao;
    List<DetCertInsemArt> semences;

    public DetCertIAListAdapter(Context ctxt, List<DetCertInsemArt> semences) {

        super(ctxt, -1);

        this.context = ctxt;

        this.semences = semences;

    }

    @Nullable
    @Override
    public DetCertInsemArt getItem(int position) {
        return semences.get(position);
    }

    @Override
    public int getCount() {
        return (semences!=null)?semences.size():0;
    }

    @Override
    public int getPosition(DetCertInsemArt item) {
        return semences.indexOf(item);
    }

    @Override
    public void remove(DetCertInsemArt detCertInsemArt){
        semences.remove(detCertInsemArt);
        super.remove(detCertInsemArt);
    }

    public  void removeAll(){
        if(semences!=null)
        semences.clear();
    }
    public void setListDetCertIA(List<DetCertInsemArt> semences){
        removeAll();
        this.semences = semences;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       View rootView =  layoutInflater.inflate(R.layout.list_det_cert_ia_item,parent,false);

        String nni_vl = (semences.get(position).getAnimal().getNV_NNI() !=null && semences.get(position).getAnimal().getNV_NNI().length()>4)?semences.get(position).getAnimal().getNV_NNI():semences.get(position).getAnimal().getNni_bovin();

        TarifSemence ts =semences.get(position).getSemence().getTarifSemence();
        String cout  = (ts != null)? String.valueOf(ts.getPV_Adh1()):"";
       ((TextView) rootView.findViewById(R.id.nni_vl)).setText(nni_vl);
       ((TextView) rootView.findViewById(R.id.orderIA)).setText(semences.get(position).getOrdreIA()+"");
       ((TextView) rootView.findViewById(R.id.taureau)).setText(semences.get(position).getSemence().getNomTaureau());
       ((TextView) rootView.findViewById(R.id.cout)).setText(cout);


        return rootView;
    }
}
