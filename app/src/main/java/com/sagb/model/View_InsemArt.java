package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * Created by USER on 06/11/16.
 */
@Entity
public class View_InsemArt {

    @Property(nameInDb = "Id_DetCertIA")     private long Id_DetCertIA;
           @Property(nameInDb = "Id_Animal")     private long Id_Animal;
           @Property(nameInDb = "DateInsem")     private Date DateInsem;
           @Property(nameInDb ="Id_Semence" )     private long  Id_Semence;
           @Property(nameInDb ="CodeOper" )     private long CodeOper;
           @Property(nameInDb = "OrdreIA")     private String OrdreIA;
           @Property(nameInDb ="NumCertIA" )     private String StrNumCertIA;
           @Property(nameInDb = "CodeUP")     private long CodeUP;
        @Generated(hash = 1455249360)
        public View_InsemArt(long Id_DetCertIA, long Id_Animal, Date DateInsem,
                long Id_Semence, long CodeOper, String OrdreIA, String StrNumCertIA,
                long CodeUP) {
            this.Id_DetCertIA = Id_DetCertIA;
            this.Id_Animal = Id_Animal;
            this.DateInsem = DateInsem;
            this.Id_Semence = Id_Semence;
            this.CodeOper = CodeOper;
            this.OrdreIA = OrdreIA;
            this.StrNumCertIA = StrNumCertIA;
            this.CodeUP = CodeUP;
        }
        @Generated(hash = 1297141655)
        public View_InsemArt() {
        }
        public long getId_DetCertIA() {
            return this.Id_DetCertIA;
        }
        public void setId_DetCertIA(long Id_DetCertIA) {
            this.Id_DetCertIA = Id_DetCertIA;
        }
        public long getId_Animal() {
            return this.Id_Animal;
        }
        public void setId_Animal(long Id_Animal) {
            this.Id_Animal = Id_Animal;
        }
        public Date getDateInsem() {
            return this.DateInsem;
        }
        public void setDateInsem(Date DateInsem) {
            this.DateInsem = DateInsem;
        }
        public long getId_Semence() {
            return this.Id_Semence;
        }
        public void setId_Semence(long Id_Semence) {
            this.Id_Semence = Id_Semence;
        }
        public long getCodeOper() {
            return this.CodeOper;
        }
        public void setCodeOper(long CodeOper) {
            this.CodeOper = CodeOper;
        }
        public String getOrdreIA() {
            return this.OrdreIA;
        }
        public void setOrdreIA(String OrdreIA) {
            this.OrdreIA = OrdreIA;
        }
        public String getStrNumCertIA() {
            return this.StrNumCertIA;
        }
        public void setStrNumCertIA(String StrNumCertIA) {
            this.StrNumCertIA = StrNumCertIA;
        }
        public long getCodeUP() {
            return this.CodeUP;
        }
        public void setCodeUP(long CodeUP) {
            this.CodeUP = CodeUP;
        }
    
}
