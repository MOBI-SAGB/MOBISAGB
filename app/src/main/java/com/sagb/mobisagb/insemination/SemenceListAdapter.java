package com.sagb.mobisagb.insemination;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sagb.model.DetCertInsemArt;
import com.sagb.model.SemenceDao;

import java.util.List;

/**
 * Created by USER on 08/11/16.
 */

public class SemenceListAdapter extends ArrayAdapter<DetCertInsemArt> {

    private Context context;
    SemenceDao semenceDao;
    List<DetCertInsemArt> semences;

    public SemenceListAdapter(Context context, int resource) {

        super(context, resource);
        this.context = context;

        //semences =semenceDao.loadAll();
        //semences =semenceDao.loadAll();

    }

    @Nullable
    @Override
    public DetCertInsemArt getItem(int position) {
        return semences.get(position);
    }

    @Override
    public int getCount() {
        return semences.size();
    }

    @Override
    public int getPosition(DetCertInsemArt item) {
        return semences.indexOf(item);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       View rootView =  layoutInflater.inflate(R.layout.list_semence_item,parent);

      // ((TextView) rootView.findViewById(R.id.dateSemence_tv)).setText(semences.get(position).);

        return rootView;
    }
}
