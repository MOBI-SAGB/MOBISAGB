package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by USER on 05/11/16.
 */
@Entity(nameInDb ="UniteProduction" )
public class UniteProduction {

    @Id

    @Property(nameInDb = "CodeUP")
    private long CodeUP;

    @Property(nameInDb = "CodeProd" )
    private long CodeProd;

    @Property(nameInDb = "StrinRefUP" )
    private String StrinRefUP;

    @Property(nameInDb = "NomUP" )
    private String NomUP;

    @Property(nameInDb = "CtrLait" )
    private String CtrLait;

    @Property(nameInDb = "NewUP" )
    private String NewUP;

    @Property(nameInDb = "Export" )
    private boolean Export;

    @Property(nameInDb = "Code_Zone" )
    private long Code_Zone;

    @Generated(hash = 1346533026)
    public UniteProduction(long CodeUP, long CodeProd, String StrinRefUP,
            String NomUP, String CtrLait, String NewUP, boolean Export,
            long Code_Zone) {
        this.CodeUP = CodeUP;
        this.CodeProd = CodeProd;
        this.StrinRefUP = StrinRefUP;
        this.NomUP = NomUP;
        this.CtrLait = CtrLait;
        this.NewUP = NewUP;
        this.Export = Export;
        this.Code_Zone = Code_Zone;
    }

    @Generated(hash = 1396192029)
    public UniteProduction() {
    }

    public long getCodeUP() {
        return CodeUP;
    }

    public void setCodeUP(long codeUP) {
        CodeUP = codeUP;
    }

    public long getCodeProd() {
        return CodeProd;
    }

    public void setCodeProd(long codeProd) {
        CodeProd = codeProd;
    }

    public String getStrinRefUP() {
        return StrinRefUP;
    }

    public void setStrinRefUP(String strinRefUP) {
        StrinRefUP = strinRefUP;
    }

    public String getNomUP() {
        return NomUP;
    }

    public void setNomUP(String nomUP) {
        NomUP = nomUP;
    }

    public String getCtrLait() {
        return CtrLait;
    }

    public void setCtrLait(String ctrLait) {
        CtrLait = ctrLait;
    }

    public String getNewUP() {
        return NewUP;
    }

    public void setNewUP(String newUP) {
        NewUP = newUP;
    }

    public boolean isExport() {
        return Export;
    }

    public void setExport(boolean export) {
        Export = export;
    }

    public long getCode_Zone() {
        return Code_Zone;
    }

    public void setCode_Zone(long code_Zone) {
        Code_Zone = code_Zone;
    }

    public boolean getExport() {
        return this.Export;
    }

    @Override
    public String toString() {
        return NomUP;
    }
}
