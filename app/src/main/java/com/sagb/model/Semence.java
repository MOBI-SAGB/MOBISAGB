package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;


@Entity(nameInDb = "Semences")
public class Semence {

    @Id
    @Property(nameInDb = "Id_Semence")
    private long Id_Semence;

    @Property(nameInDb = "Id_ChoixSem")
    private long Id_ChoixSem;

    @Property(nameInDb = "NomTaureau")
    private String  NomTaureau;

    @Property(nameInDb = "Id_Race")
    private long Id_Race;

    @Property(nameInDb = "SemActif")
    private String SemActif;

    @Property(nameInDb = "Id_OrigAnim")
    private long Id_OrigAnim;


    @Generated(hash = 1990482098)
    public Semence(long Id_Semence, long Id_ChoixSem, String NomTaureau,
            long Id_Race, String SemActif, long Id_OrigAnim) {
        this.Id_Semence = Id_Semence;
        this.Id_ChoixSem = Id_ChoixSem;
        this.NomTaureau = NomTaureau;
        this.Id_Race = Id_Race;
        this.SemActif = SemActif;
        this.Id_OrigAnim = Id_OrigAnim;
    }

    @Generated(hash = 959847561)
    public Semence() {
    }


    public long getId_Semence() {
        return Id_Semence;
    }

    public void setId_Semence(long id_Semence) {
        Id_Semence = id_Semence;
    }

    public long getId_ChoixSem() {
        return Id_ChoixSem;
    }

    public void setId_ChoixSem(long id_ChoixSem) {
        Id_ChoixSem = id_ChoixSem;
    }

    public String getNomTaureau() {
        return NomTaureau;
    }

    public void setNomTaureau(String nomTaureau) {
        NomTaureau = nomTaureau;
    }

    public long getId_Race() {
        return Id_Race;
    }

    public void setId_Race(long id_Race) {
        Id_Race = id_Race;
    }

    public String getSemActif() {
        return SemActif;
    }

    public void setSemActif(String semActif) {
        SemActif = semActif;
    }

    public long getId_OrigAnim() {
        return Id_OrigAnim;
    }

    public void setId_OrigAnim(long id_OrigAnim) {
        Id_OrigAnim = id_OrigAnim;
    }




}
