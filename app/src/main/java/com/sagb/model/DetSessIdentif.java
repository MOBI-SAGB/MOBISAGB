package com.sagb.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by USER on 06/11/16.
 */
@Entity
public class DetSessIdentif {

    @Id
    private long IdSessIdentification;

    @Property(nameInDb = "Id_Animal")
    private long Id_Animal;

    @Property(nameInDb = "Export")
    private boolean Export;

    @ToOne(joinProperty = "Id_Animal")
    private Troupeau animal;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1723410138)
    private transient DetSessIdentifDao myDao;

    @Generated(hash = 72457903)
    public DetSessIdentif(long IdSessIdentification, long Id_Animal,
            boolean Export) {
        this.IdSessIdentification = IdSessIdentification;
        this.Id_Animal = Id_Animal;
        this.Export = Export;
    }

    @Generated(hash = 976164460)
    public DetSessIdentif() {
    }

    public long getIdSessIdentification() {
        return this.IdSessIdentification;
    }

    public void setIdSessIdentification(long IdSessIdentification) {
        this.IdSessIdentification = IdSessIdentification;
    }

    public long getId_Animal() {
        return this.Id_Animal;
    }

    public void setId_Animal(long Id_Animal) {
        this.Id_Animal = Id_Animal;
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
    @Generated(hash = 854080546)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDetSessIdentifDao() : null;
    }

}
