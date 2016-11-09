package com.sagb.mobisagb;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.sagb.mobisagb.db.App;
import com.sagb.model.Adherent;
import com.sagb.model.CertInsemArt;
import com.sagb.model.Prodecteurs;
import com.sagb.model.UniteProduction;

import java.util.List;

public class IdentificationActivity extends AppCompatActivity {

    private Spinner spadherent;
    private Spinner spproducteurs;
    private Spinner spuniteproduction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spadherent = (Spinner) findViewById(R.id.adherent_sp);
        spproducteurs = (Spinner) findViewById(R.id.producteurs_sp);
        spuniteproduction = (Spinner) findViewById(R.id.unite_production_sp);

        List<Adherent> adherent = App.getDaoSession(getApplicationContext()).getAdherentDao().queryRaw(" Order by nomAdh asc");
        ArrayAdapter<Adherent> dataAdapter = new ArrayAdapter<Adherent>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item, adherent);
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spadherent.setAdapter(dataAdapter);

        long idAdherent = ((Adherent) spadherent.getSelectedItem()).getId_Adh();

        List<Prodecteurs> producteur = App.getDaoSession(getApplicationContext()).getProdecteursDao().queryRaw(" WHERE id_Adh = ? ", String.valueOf(idAdherent));
        ArrayAdapter<Prodecteurs> dataAdapteProducteur = new ArrayAdapter<Prodecteurs>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item, producteur);
        dataAdapteProducteur.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spadherent.setAdapter(dataAdapteProducteur);

        long idProducteur = ((Prodecteurs) spproducteurs.getSelectedItem()).getCodeProd();

        List<UniteProduction> uniteProduction = App.getDaoSession(getApplicationContext()).getUniteProductionDao().queryRaw(" WHERE CodeProd ? ", String.valueOf(idProducteur));
        ArrayAdapter<UniteProduction> dataAdapterUniteProduction = new ArrayAdapter<UniteProduction>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item, uniteProduction);
        dataAdapterUniteProduction.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spadherent.setAdapter(dataAdapterUniteProduction);
    }

}
