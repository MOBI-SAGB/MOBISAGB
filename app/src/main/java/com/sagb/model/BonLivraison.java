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
 * The persistent class for the BonLivraison database table.
 * 
 */
@Entity
public class BonLivraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="Id_Livr")
	private long id_Livr;

	@Property(nameInDb="Cloture")
	private boolean cloture;

	@Property(nameInDb="DateLivr")
	private Date dateLivr;

	@Property(nameInDb="Export")
	private boolean export;


	@Property(nameInDb="CodeOper")
	private long CodeOper;

	@Property(nameInDb="Code_Op_Benef")
	private long Code_Op_Benef;

	//bi-directional many-to-one association to Operateur
	@ToOne(joinProperty = "CodeOper")
	private Operateur operateur1;

	//bi-directional many-to-one association to Operateur
	@ToOne(joinProperty = "Code_Op_Benef")
	private Operateur operateur2;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 1514139065)
	private transient BonLivraisonDao myDao;

	@Generated(hash = 813498943)
	private transient Long operateur1__resolvedKey;

	@Generated(hash = 1572570151)
	private transient Long operateur2__resolvedKey;


	public BonLivraison() {
	}
	@Generated(hash = 1165567005)
	public BonLivraison(long id_Livr, boolean cloture, Date dateLivr,
									boolean export, long CodeOper, long Code_Op_Benef) {
					this.id_Livr = id_Livr;
					this.cloture = cloture;
					this.dateLivr = dateLivr;
					this.export = export;
					this.CodeOper = CodeOper;
					this.Code_Op_Benef = Code_Op_Benef;
	}
	@Keep
	public long getId_Livr() {
		return this.id_Livr;
	}
	@Keep
	public void setId_Livr(long id_Livr) {
		this.id_Livr = id_Livr;
	}
	@Keep
	public boolean getCloture() {
		return this.cloture;
	}
	@Keep
	public void setCloture(boolean cloture) {
		this.cloture = cloture;
	}
	@Keep
	public Date getDateLivr() {
		return this.dateLivr;
	}
	@Keep
	public void setDateLivr(Date dateLivr) {
		this.dateLivr = dateLivr;
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
	public Operateur getOperateur1() {
		return this.operateur1;
	}
	@Keep
	public void setOperateur1(Operateur operateur1) {
		this.operateur1 = operateur1;
	}
	@Keep
	public Operateur getOperateur2() {
		return this.operateur2;
	}
	@Keep
	public void setOperateur2(Operateur operateur2) {
		this.operateur2 = operateur2;
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
	public long getCode_Op_Benef() {
		return Code_Op_Benef;
	}
	@Keep
	public void setCode_Op_Benef(long code_Op_Benef) {
		Code_Op_Benef = code_Op_Benef;
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
	@Generated(hash = 43185224)
	public void __setDaoSession(DaoSession daoSession) {
					this.daoSession = daoSession;
					myDao = daoSession != null ? daoSession.getBonLivraisonDao() : null;
	}
}