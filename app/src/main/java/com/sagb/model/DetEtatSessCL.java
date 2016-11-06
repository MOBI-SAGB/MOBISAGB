package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by USER on 06/11/16.
 */

@Entity
public class DetEtatSessCL {

    @Property(nameInDb = "Id_DetEtatSessCL") private  long Id_DetEtatSessCL;
            @Property(nameInDb = "Id_SessCL") private long Id_SessCL;
            @Property(nameInDb = "CodeEtat") private long CodeEtat;
            @Property(nameInDb = "Id_Animal") private long Id_Animal;
            @Generated(hash = 1086359259)
            public DetEtatSessCL(long Id_DetEtatSessCL, long Id_SessCL, long CodeEtat,
                    long Id_Animal) {
                this.Id_DetEtatSessCL = Id_DetEtatSessCL;
                this.Id_SessCL = Id_SessCL;
                this.CodeEtat = CodeEtat;
                this.Id_Animal = Id_Animal;
            }
            @Generated(hash = 584288747)
            public DetEtatSessCL() {
            }
            public long getId_DetEtatSessCL() {
                return this.Id_DetEtatSessCL;
            }
            public void setId_DetEtatSessCL(long Id_DetEtatSessCL) {
                this.Id_DetEtatSessCL = Id_DetEtatSessCL;
            }
            public long getId_SessCL() {
                return this.Id_SessCL;
            }
            public void setId_SessCL(long Id_SessCL) {
                this.Id_SessCL = Id_SessCL;
            }
            public long getCodeEtat() {
                return this.CodeEtat;
            }
            public void setCodeEtat(long CodeEtat) {
                this.CodeEtat = CodeEtat;
            }
            public long getId_Animal() {
                return this.Id_Animal;
            }
            public void setId_Animal(long Id_Animal) {
                this.Id_Animal = Id_Animal;
            }
}
