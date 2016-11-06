package com.sagb.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the CertDiagGest database table.
 * 
 */
@Entity
public class CertDiagGest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="Id_CertDG")
	private int id_CertDG;

	@Property(nameInDb="DateDG")
	private Date dateDG;

	@Property(nameInDb="Export")
	private boolean export;

	@Property(nameInDb="NumCertDG")
	private String numCertDG;

	@Property(nameInDb = "CodeOper")
	private long CodeOper;

	@Property(nameInDb = "CodeUP")
	private long CodeUP;

	//bi-directional many-to-one association to Operateur
	@ToOne(joinProperty = "CodeOper")
	private Operateur operateur;

	//bi-directional many-to-one association to UniteProduction
	@ToOne(joinProperty = "CodeUP")
	private UniteProduction uniteProduction;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 1802780619)
	private transient CertDiagGestDao myDao;

	@Generated(hash = 67236089)
	private transient Long operateur__resolvedKey;

	@Generated(hash = 2054519328)
	private transient Long uniteProduction__resolvedKey;

	public CertDiagGest() {
	}

	@Generated(hash = 1061111030)
	public CertDiagGest(int id_CertDG, Date dateDG, boolean export,
									String numCertDG, long CodeOper, long CodeUP) {
					this.id_CertDG = id_CertDG;
					this.dateDG = dateDG;
					this.export = export;
					this.numCertDG = numCertDG;
					this.CodeOper = CodeOper;
					this.CodeUP = CodeUP;
	}

    @Keep
	public int getId_CertDG() {
		return this.id_CertDG;
	}
    @Keep
	public void setId_CertDG(int id_CertDG) {
		this.id_CertDG = id_CertDG;
	}
    @Keep
	public Date getDateDG() {
		return this.dateDG;
	}
    @Keep
	public void setDateDG(Date dateDG) {
		this.dateDG = dateDG;
	}
    @Keep
	public boolean getExport() {
		return this.export;
	}
    @Keep
	public void setExport(boolean export) {
		this.export = export;
	}
    @Keep
	public String getNumCertDG() {
		return this.numCertDG;
	}
    @Keep
	public void setNumCertDG(String numCertDG) {
		this.numCertDG = numCertDG;
	}
    @Keep
	public Operateur getOperateur() {
		return this.operateur;
	}
    @Keep
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}
    @Keep
	public UniteProduction getUniteProduction() {
		return this.uniteProduction;
	}
    @Keep
	public void setUniteProduction(UniteProduction uniteProduction) {
		this.uniteProduction = uniteProduction;
	}
    @Keep
    public long getCodeOper() {
        return CodeOper;
    }
    @Keep
    public void setCodeOper(long codeOper) {
        CodeOper = codeOper;
    }
    @Keep
    public long getCodeUP() {
        return CodeUP;
    }
    @Keep
    public void setCodeUP(long codeUP) {
        CodeUP = codeUP;
    }
    @Keep
    public boolean isExport() {
        return export;
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
	@Generated(hash = 1350197356)
	public void __setDaoSession(DaoSession daoSession) {
					this.daoSession = daoSession;
					myDao = daoSession != null ? daoSession.getCertDiagGestDao() : null;
	}
}