package com.sagb.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.Date;

/**
 * Created by USER on 06/11/16.
 */
@Entity
public class Perte {

    private long IDPertes;

    private Date Date_Perte;
    private int Qte_Perte;

    @Property(nameInDb = "Id_Semence")
    private long Id_Semence;

    @Property(nameInDb = "CodeOper")
    private  long CodeOper;

    private boolean Export;

    @Property(nameInDb = "IDType_Perte")
    private long IDType_Perte;

    @ToOne(joinProperty = "CodeOper")
    private Operateur operateur;

    @ToOne(joinProperty = "Id_Semence")
    private Semence semence;

    @ToOne(joinProperty = "IDType_Perte")
    private Type_Perte type_perte;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 38579112)
    private transient PerteDao myDao;

    @Generated(hash = 2116057570)
    public Perte(long IDPertes, Date Date_Perte, int Qte_Perte, long Id_Semence,
            long CodeOper, boolean Export, long IDType_Perte) {
        this.IDPertes = IDPertes;
        this.Date_Perte = Date_Perte;
        this.Qte_Perte = Qte_Perte;
        this.Id_Semence = Id_Semence;
        this.CodeOper = CodeOper;
        this.Export = Export;
        this.IDType_Perte = IDType_Perte;
    }

    @Generated(hash = 593484223)
    public Perte() {
    }

    public long getIDPertes() {
        return this.IDPertes;
    }

    public void setIDPertes(long IDPertes) {
        this.IDPertes = IDPertes;
    }

    public Date getDate_Perte() {
        return this.Date_Perte;
    }

    public void setDate_Perte(Date Date_Perte) {
        this.Date_Perte = Date_Perte;
    }

    public int getQte_Perte() {
        return this.Qte_Perte;
    }

    public void setQte_Perte(int Qte_Perte) {
        this.Qte_Perte = Qte_Perte;
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

    public boolean getExport() {
        return this.Export;
    }

    public void setExport(boolean Export) {
        this.Export = Export;
    }

    public long getIDType_Perte() {
        return this.IDType_Perte;
    }

    public void setIDType_Perte(long IDType_Perte) {
        this.IDType_Perte = IDType_Perte;
    }

    @Generated(hash = 67236089)
    private transient Long operateur__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 987355601)
    public Operateur getOperateur() {
        long __key = this.CodeOper;
        if (operateur__resolvedKey == null
                || !operateur__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            OperateurDao targetDao = daoSession.getOperateurDao();
            Operateur operateurNew = targetDao.load(__key);
            synchronized (this) {
                operateur = operateurNew;
                operateur__resolvedKey = __key;
            }
        }
        return operateur;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 4545996)
    public void setOperateur(@NotNull Operateur operateur) {
        if (operateur == null) {
            throw new DaoException(
                    "To-one property 'CodeOper' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.operateur = operateur;
            CodeOper = operateur.getCodeOper();
            operateur__resolvedKey = CodeOper;
        }
    }

    @Generated(hash = 93694676)
    private transient Long semence__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1407738499)
    public Semence getSemence() {
        long __key = this.Id_Semence;
        if (semence__resolvedKey == null || !semence__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SemenceDao targetDao = daoSession.getSemenceDao();
            Semence semenceNew = targetDao.load(__key);
            synchronized (this) {
                semence = semenceNew;
                semence__resolvedKey = __key;
            }
        }
        return semence;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1971201646)
    public void setSemence(@NotNull Semence semence) {
        if (semence == null) {
            throw new DaoException(
                    "To-one property 'Id_Semence' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.semence = semence;
            Id_Semence = semence.getId_Semence();
            semence__resolvedKey = Id_Semence;
        }
    }

    @Generated(hash = 663353881)
    private transient Long type_perte__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1718638460)
    public Type_Perte getType_perte() {
        long __key = this.IDType_Perte;
        if (type_perte__resolvedKey == null
                || !type_perte__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            Type_PerteDao targetDao = daoSession.getType_PerteDao();
            Type_Perte type_perteNew = targetDao.load(__key);
            synchronized (this) {
                type_perte = type_perteNew;
                type_perte__resolvedKey = __key;
            }
        }
        return type_perte;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 402458795)
    public void setType_perte(@NotNull Type_Perte type_perte) {
        if (type_perte == null) {
            throw new DaoException(
                    "To-one property 'IDType_Perte' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.type_perte = type_perte;
            IDType_Perte = type_perte.getIDType_Perte();
            type_perte__resolvedKey = IDType_Perte;
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
    @Generated(hash = 1205081255)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPerteDao() : null;
    }

}
