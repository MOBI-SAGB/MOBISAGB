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
 * The persistent class for the CertInsemArt database table.
 * 
 */
@Entity
public class CertInsemArt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="Id_CertIA")
	private long id_CertIA;

	@Property(nameInDb="DateInsem")
	private Date dateInsem;

	@Property(nameInDb="Export")
	private boolean export;

	@Property(nameInDb="Id_Regl")
	private int id_Regl;

	@Property(nameInDb="NumCertIA")
	private String numCertIA;

	@Property(nameInDb="NumRecu")
	private String numRecu;

	@Property(nameInDb="CodeOper")
	private long CodeOper;

	@Property(nameInDb="CodeUP")
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
	@Generated(hash = 423285703)
	private transient CertInsemArtDao myDao;

	@Generated(hash = 67236089)
	private transient Long operateur__resolvedKey;

	@Generated(hash = 2054519328)
	private transient Long uniteProduction__resolvedKey;

	public CertInsemArt() {
	}
	@Generated(hash = 1960665682)
	public CertInsemArt(long id_CertIA, Date dateInsem, boolean export, int id_Regl,
									String numCertIA, String numRecu, long CodeOper, long CodeUP) {
					this.id_CertIA = id_CertIA;
					this.dateInsem = dateInsem;
					this.export = export;
					this.id_Regl = id_Regl;
					this.numCertIA = numCertIA;
					this.numRecu = numRecu;
					this.CodeOper = CodeOper;
					this.CodeUP = CodeUP;
	}
	@Keep
	public long getId_CertIA() {
		return this.id_CertIA;
	}
	@Keep
	public void setId_CertIA(long id_CertIA) {
		this.id_CertIA = id_CertIA;
	}
	@Keep
	public Date getDateInsem() {
		return this.dateInsem;
	}
	@Keep
	public void setDateInsem(Date dateInsem) {
		this.dateInsem = dateInsem;
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
	public int getId_Regl() {
		return this.id_Regl;
	}
	@Keep
	public void setId_Regl(int id_Regl) {
		this.id_Regl = id_Regl;
	}
	@Keep
	public String getNumCertIA() {
		return this.numCertIA;
	}
	@Keep
	public void setNumCertIA(String numCertIA) {
		this.numCertIA = numCertIA;
	}
	@Keep
	public String getNumRecu() {
		return this.numRecu;
	}
	@Keep
	public void setNumRecu(String numRecu) {
		this.numRecu = numRecu;
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
	@Generated(hash = 991082128)
	public void __setDaoSession(DaoSession daoSession) {
					this.daoSession = daoSession;
					myDao = daoSession != null ? daoSession.getCertInsemArtDao() : null;
	}
}