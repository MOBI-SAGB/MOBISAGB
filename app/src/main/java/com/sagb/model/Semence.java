package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;


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

    @ToOne(joinProperty = "Id_ChoixSem")
    private  TarifSemence tarifSemence;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 80482958)
    private transient SemenceDao myDao;

    @Generated(hash = 1061360636)
    private transient Long tarifSemence__resolvedKey;

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

    @Override
    public String toString() {
        return NomTaureau;
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 2064534359)
    public TarifSemence getTarifSemence() {
        long __key = this.Id_ChoixSem;
        if (tarifSemence__resolvedKey == null
                || !tarifSemence__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TarifSemenceDao targetDao = daoSession.getTarifSemenceDao();
            TarifSemence tarifSemenceNew = targetDao.load(__key);
            synchronized (this) {
                tarifSemence = tarifSemenceNew;
                tarifSemence__resolvedKey = __key;
            }
        }
        return tarifSemence;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 615940960)
    public void setTarifSemence(@NotNull TarifSemence tarifSemence) {
        if (tarifSemence == null) {
            throw new DaoException(
                    "To-one property 'Id_ChoixSem' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.tarifSemence = tarifSemence;
            Id_ChoixSem = tarifSemence.getId_ChoixSem();
            tarifSemence__resolvedKey = Id_ChoixSem;
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
    @Generated(hash = 1408517969)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSemenceDao() : null;
    }
}
