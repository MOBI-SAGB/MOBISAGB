package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by USER on 08/11/16.
 */

@Entity(nameInDb = "DetCertInsemArt")
public class DetCertInsemArt {

    @Id
    @Property(nameInDb = "Id_DetCertIA")
    private long Id_DetCertIA;

    @Property(nameInDb = "Id_Semence")
    private  long Id_Semence;

    @Property(nameInDb = "OrdreIA")
    private  long OrdreIA;

    @Property(nameInDb = "SignChal")
    private  String SignChal;

    @Property(nameInDb = "PrixSem")
    private  double PrixSem;

    @Property(nameInDb = "Id_Animal")
    private  long Id_Animal;

    @Property(nameInDb = "Id_CertIA")
    private  long Id_CertIA;

    @Property(nameInDb = "NumLact")
    private  long NumLact;

    @Property(nameInDb = "Export")
    private  long export;

    @Property(nameInDb = "Motif_Reset")
    private  long motifReset;

    @Property(nameInDb = "SNIT")
    private  boolean snit;

    @Property(nameInDb = "Modif")
    private  boolean modif;


    @ToOne(joinProperty = "Id_CertIA")
    private  CertInsemArt certInsemArt;

    @ToOne(joinProperty = "Id_Semence")
    private  Semence semence;

    @ToOne(joinProperty = "Id_Animal")
    private  Troupeau animal;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 491907913)
    private transient DetCertInsemArtDao myDao;

    @Generated(hash = 2077289039)
    public DetCertInsemArt(long Id_DetCertIA, long Id_Semence, long OrdreIA,
            String SignChal, double PrixSem, long Id_Animal, long Id_CertIA,
            long NumLact, long export, long motifReset, boolean snit,
            boolean modif) {
        this.Id_DetCertIA = Id_DetCertIA;
        this.Id_Semence = Id_Semence;
        this.OrdreIA = OrdreIA;
        this.SignChal = SignChal;
        this.PrixSem = PrixSem;
        this.Id_Animal = Id_Animal;
        this.Id_CertIA = Id_CertIA;
        this.NumLact = NumLact;
        this.export = export;
        this.motifReset = motifReset;
        this.snit = snit;
        this.modif = modif;
    }

    @Generated(hash = 110185480)
    public DetCertInsemArt() {
    }

    public long getId_DetCertIA() {
        return this.Id_DetCertIA;
    }

    public void setId_DetCertIA(long Id_DetCertIA) {
        this.Id_DetCertIA = Id_DetCertIA;
    }

    public long getId_Semence() {
        return this.Id_Semence;
    }

    public void setId_Semence(long Id_Semence) {
        this.Id_Semence = Id_Semence;
    }

    public long getOrdreIA() {
        return this.OrdreIA;
    }

    public void setOrdreIA(long OrdreIA) {
        this.OrdreIA = OrdreIA;
    }

    public String getSignChal() {
        return this.SignChal;
    }

    public void setSignChal(String SignChal) {
        this.SignChal = SignChal;
    }

    public double getPrixSem() {
        return this.PrixSem;
    }

    public void setPrixSem(double PrixSem) {
        this.PrixSem = PrixSem;
    }

    public long getId_Animal() {
        return this.Id_Animal;
    }

    public void setId_Animal(long Id_Animal) {
        this.Id_Animal = Id_Animal;
    }

    public long getId_CertIA() {
        return this.Id_CertIA;
    }

    public void setId_CertIA(long Id_CertIA) {
        this.Id_CertIA = Id_CertIA;
    }

    public long getNumLact() {
        return this.NumLact;
    }

    public void setNumLact(long NumLact) {
        this.NumLact = NumLact;
    }

    public long getExport() {
        return this.export;
    }

    public void setExport(long export) {
        this.export = export;
    }

    public long getMotifReset() {
        return this.motifReset;
    }

    public void setMotifReset(long motifReset) {
        this.motifReset = motifReset;
    }

    public boolean getSnit() {
        return this.snit;
    }

    public void setSnit(boolean snit) {
        this.snit = snit;
    }

    public boolean getModif() {
        return this.modif;
    }

    public void setModif(boolean modif) {
        this.modif = modif;
    }

    @Generated(hash = 42873668)
    private transient Long certInsemArt__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 433325302)
    public CertInsemArt getCertInsemArt() {
        long __key = this.Id_CertIA;
        if (certInsemArt__resolvedKey == null
                || !certInsemArt__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CertInsemArtDao targetDao = daoSession.getCertInsemArtDao();
            CertInsemArt certInsemArtNew = targetDao.load(__key);
            synchronized (this) {
                certInsemArt = certInsemArtNew;
                certInsemArt__resolvedKey = __key;
            }
        }
        return certInsemArt;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 2086135248)
    public void setCertInsemArt(@NotNull CertInsemArt certInsemArt) {
        if (certInsemArt == null) {
            throw new DaoException(
                    "To-one property 'Id_CertIA' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.certInsemArt = certInsemArt;
            Id_CertIA = certInsemArt.getId_CertIA();
            certInsemArt__resolvedKey = Id_CertIA;
        }
    }

    @Generated(hash = 93694676)
    private transient Long semence__resolvedKey;

    @Generated(hash = 1233853005)
    private transient Long animal__resolvedKey;

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

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1204802372)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDetCertInsemArtDao() : null;
    }


}
