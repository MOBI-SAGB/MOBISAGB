package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.io.Serializable;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;


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

    @Property(nameInDb="codeFonct")
    private int codeFonct;

    @ToOne(joinProperty ="codeFonct")
    Fonction fonction;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1951363865)
    private transient OperateurDao myDao;

    @Generated(hash = 1383781355)
    private transient Integer fonction__resolvedKey;


    public Operateur() {
    }

    @Generated(hash = 174787295)
    public Operateur(long codeOper, String nomOper, String passWord,
            String userName, int codeFonct) {
        this.codeOper = codeOper;
        this.nomOper = nomOper;
        this.passWord = passWord;
        this.userName = userName;
        this.codeFonct = codeFonct;
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

    public int getCodeFonct() {
        return this.codeFonct;
    }

    public void setCodeFonct(int codeFonct) {
        this.codeFonct = codeFonct;
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1985514025)
    public Fonction getFonction() {
        int __key = this.codeFonct;
        if (fonction__resolvedKey == null || !fonction__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FonctionDao targetDao = daoSession.getFonctionDao();
            Fonction fonctionNew = targetDao.load(__key);
            synchronized (this) {
                fonction = fonctionNew;
                fonction__resolvedKey = __key;
            }
        }
        return fonction;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 242706850)
    public void setFonction(@NotNull Fonction fonction) {
        if (fonction == null) {
            throw new DaoException(
                    "To-one property 'codeFonct' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.fonction = fonction;
            codeFonct = fonction.getCodeFonct();
            fonction__resolvedKey = codeFonct;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 274184997)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getOperateurDao() : null;
    }


}