package com.sagb.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by USER on 06/11/16.
 */

@Entity
public class DetSessIdentReforme {

    @Id
    private long Id_DetSessIdentReforme;

    private long Id_SessReforme;

    private long Id_Animal;

    private long NoteEval;

    private boolean Export;

    @ToOne(joinProperty = "Id_Animal")
    private Troupeau animal;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 194070875)
    private transient DetSessIdentReformeDao myDao;

    @Generated(hash = 1059513568)
    public DetSessIdentReforme(long Id_DetSessIdentReforme, long Id_SessReforme,
            long Id_Animal, long NoteEval, boolean Export) {
        this.Id_DetSessIdentReforme = Id_DetSessIdentReforme;
        this.Id_SessReforme = Id_SessReforme;
        this.Id_Animal = Id_Animal;
        this.NoteEval = NoteEval;
        this.Export = Export;
    }

    @Generated(hash = 2027814690)
    public DetSessIdentReforme() {
    }

    public long getId_DetSessIdentReforme() {
        return this.Id_DetSessIdentReforme;
    }

    public void setId_DetSessIdentReforme(long Id_DetSessIdentReforme) {
        this.Id_DetSessIdentReforme = Id_DetSessIdentReforme;
    }

    public long getId_SessReforme() {
        return this.Id_SessReforme;
    }

    public void setId_SessReforme(long Id_SessReforme) {
        this.Id_SessReforme = Id_SessReforme;
    }

    public long getId_Animal() {
        return this.Id_Animal;
    }

    public void setId_Animal(long Id_Animal) {
        this.Id_Animal = Id_Animal;
    }

    public long getNoteEval() {
        return this.NoteEval;
    }

    public void setNoteEval(long NoteEval) {
        this.NoteEval = NoteEval;
    }

    public boolean getExport() {
        return this.Export;
    }

    public void setExport(boolean Export) {
        this.Export = Export;
    }

    @Generated(hash = 1233853005)
    private transient Long animal__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1743797393)
    public Troupeau getAnimal() {
        long __key = this.Id_Animal;
        if (animal__resolvedKey == null || !animal__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TroupeauDao targetDao = daoSession.getTroupeauDao();
            Troupeau animalNew = targetDao.load(__key);
            synchronized (this) {
                animal = animalNew;
                animal__resolvedKey = __key;
            }
        }
        return animal;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 354587313)
    public void setAnimal(@NotNull Troupeau animal) {
        if (animal == null) {
            throw new DaoException(
                    "To-one property 'Id_Animal' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.animal = animal;
            Id_Animal = animal.getId_animal();
            animal__resolvedKey = Id_Animal;
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
    @Generated(hash = 2120944389)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDetSessIdentReformeDao() : null;
    }
}

