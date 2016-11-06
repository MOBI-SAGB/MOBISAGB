package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import static com.sagb.model.AdherentDao.Properties.Id_Adh;
import static com.sagb.model.UniteProductionDao.Properties.CodeProd;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by USER on 06/11/16.
 */
@Entity
public class Prodecteurs {

    private long CodeProd;
    private String RefProd;
    private String NomProd;

    @Property(nameInDb = "Id_Adh")
    private long Id_Adh;

    @ToOne(joinProperty = "Id_Adh")
    private  Adherent adherent ;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 616009829)
    private transient ProdecteursDao myDao;

    @Generated(hash = 603029601)
    public Prodecteurs(long CodeProd, String RefProd, String NomProd, long Id_Adh) {
        this.CodeProd = CodeProd;
        this.RefProd = RefProd;
        this.NomProd = NomProd;
        this.Id_Adh = Id_Adh;
    }

    @Generated(hash = 519144390)
    public Prodecteurs() {
    }

    public long getCodeProd() {
        return this.CodeProd;
    }

    public void setCodeProd(long CodeProd) {
        this.CodeProd = CodeProd;
    }

    public String getRefProd() {
        return this.RefProd;
    }

    public void setRefProd(String RefProd) {
        this.RefProd = RefProd;
    }

    public String getNomProd() {
        return this.NomProd;
    }

    public void setNomProd(String NomProd) {
        this.NomProd = NomProd;
    }

    public long getId_Adh() {
        return this.Id_Adh;
    }

    public void setId_Adh(long Id_Adh) {
        this.Id_Adh = Id_Adh;
    }

    @Generated(hash = 1034707462)
    private transient Long adherent__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 2116453722)
    public Adherent getAdherent() {
        long __key = this.Id_Adh;
        if (adherent__resolvedKey == null || !adherent__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AdherentDao targetDao = daoSession.getAdherentDao();
            Adherent adherentNew = targetDao.load(__key);
            synchronized (this) {
                adherent = adherentNew;
                adherent__resolvedKey = __key;
            }
        }
        return adherent;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1939006686)
    public void setAdherent(@NotNull Adherent adherent) {
        if (adherent == null) {
            throw new DaoException(
                    "To-one property 'Id_Adh' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.adherent = adherent;
            Id_Adh = adherent.getId_Adh();
            adherent__resolvedKey = Id_Adh;
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
    @Generated(hash = 768337085)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getProdecteursDao() : null;
    }

}
