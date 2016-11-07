package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import static com.sagb.model.DetSessCLDao.Properties.Id_DetSessCL;
import static com.sagb.model.TraiteDao.Properties.Id_Traite;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by USER on 06/11/16.
 */

@Entity
public class DetProductionLait {

    @Property(nameInDb = "Id_DetProdLait") private  long Id_DetProdLait;
            @Property(nameInDb = "Id_DetSessCL") private long Id_DetSessCL;
            @Property(nameInDb = "Id_Traite") private long Id_Traite;
            @Property(nameInDb = "Id_SessCL") private long Id_SessCL;
            @Property(nameInDb = "NumLot") private String NumLot;
            @Property(nameInDb = "QteLait") private int QteLait;
            @Generated(hash = 1358245719)
            public DetProductionLait(long Id_DetProdLait, long Id_DetSessCL, long Id_Traite,
                    long Id_SessCL, String NumLot, int QteLait) {
                this.Id_DetProdLait = Id_DetProdLait;
                this.Id_DetSessCL = Id_DetSessCL;
                this.Id_Traite = Id_Traite;
                this.Id_SessCL = Id_SessCL;
                this.NumLot = NumLot;
                this.QteLait = QteLait;
            }
            @Generated(hash = 1759855411)
            public DetProductionLait() {
            }
            public long getId_DetProdLait() {
                return this.Id_DetProdLait;
            }
            public void setId_DetProdLait(long Id_DetProdLait) {
                this.Id_DetProdLait = Id_DetProdLait;
            }
            public long getId_DetSessCL() {
                return this.Id_DetSessCL;
            }
            public void setId_DetSessCL(long Id_DetSessCL) {
                this.Id_DetSessCL = Id_DetSessCL;
            }
            public long getId_Traite() {
                return this.Id_Traite;
            }
            public void setId_Traite(long Id_Traite) {
                this.Id_Traite = Id_Traite;
            }
            public long getId_SessCL() {
                return this.Id_SessCL;
            }
            public void setId_SessCL(long Id_SessCL) {
                this.Id_SessCL = Id_SessCL;
            }
            public String getNumLot() {
                return this.NumLot;
            }
            public void setNumLot(String NumLot) {
                this.NumLot = NumLot;
            }
            public int getQteLait() {
                return this.QteLait;
            }
            public void setQteLait(int QteLait) {
                this.QteLait = QteLait;
            }
    
}
