package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.io.Serializable;


/**
 * The persistent class for the Operateurs database table.
 *
 */
@Entity
public class Operateur implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Property(nameInDb="CodeOper")
    private long codeOper;

    @Property(nameInDb="NomOper")
    private String nomOper;

    @Property(nameInDb="PassWord")
    private String passWord;

    @Property(nameInDb="UserName")
    private String userName;


    public Operateur() {
    }

    @Generated(hash = 884152182)
    public Operateur(long codeOper, String nomOper, String passWord,
            String userName) {
        this.codeOper = codeOper;
        this.nomOper = nomOper;
        this.passWord = passWord;
        this.userName = userName;
    }

    public long getCodeOper() {
        return this.codeOper;
    }

    public void setCodeOper(long codeOper) {
        this.codeOper = codeOper;
    }

    public String getNomOper() {
        return this.nomOper;
    }

    public void setNomOper(String nomOper) {
        this.nomOper = nomOper;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}