package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by USER on 06/11/16.
 */
@Entity
public class Vehicule_SessionControle {

    private long Id_SessCL;

    private long IDVehicule;

    private double Index_Km;
    private double Km_Arrive;

    @Generated(hash = 47869728)
    public Vehicule_SessionControle(long Id_SessCL, long IDVehicule,
            double Index_Km, double Km_Arrive) {
        this.Id_SessCL = Id_SessCL;
        this.IDVehicule = IDVehicule;
        this.Index_Km = Index_Km;
        this.Km_Arrive = Km_Arrive;
    }
    @Generated(hash = 1387333211)
    public Vehicule_SessionControle() {
    }
    public long getId_SessCL() {
        return this.Id_SessCL;
    }
    public void setId_SessCL(long Id_SessCL) {
        this.Id_SessCL = Id_SessCL;
    }
    public long getIDVehicule() {
        return this.IDVehicule;
    }
    public void setIDVehicule(long IDVehicule) {
        this.IDVehicule = IDVehicule;
    }
    public double getIndex_Km() {
        return this.Index_Km;
    }
    public void setIndex_Km(double Index_Km) {
        this.Index_Km = Index_Km;
    }
    public double getKm_Arrive() {
        return this.Km_Arrive;
    }
    public void setKm_Arrive(double Km_Arrive) {
        this.Km_Arrive = Km_Arrive;
    }
}
