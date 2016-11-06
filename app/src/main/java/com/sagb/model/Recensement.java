package com.sagb.model;


import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the Recensement database table.
 * 
 */
@Entity
public class Recensement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int IDRecensement;

	@Property(nameInDb="Date_Recensement")
	private Date date_Recensement;

	@Property(nameInDb="Export")
	private boolean export;

	@Property(nameInDb = "CodeOper")
	private long CodeOper;

	@Property(nameInDb = "CodeUP")
	private long CodeUP;

	//bi-directional many-to-one association to Operateur
	@ToOne(joinProperty ="CodeOper" )
	private Operateur operateur;

	//bi-directional many-to-one association to UniteProduction
	@ToOne(joinProperty = "CodeUP")
	private UniteProduction uniteProduction;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 1841857505)
	private transient RecensementDao myDao;

	@Generated(hash = 67236089)
	private transient Long operateur__resolvedKey;

	@Generated(hash = 2054519328)
	private transient Long uniteProduction__resolvedKey;

	public Recensement() {
	}

	@Generated(hash = 990707027)
	public Recensement(int IDRecensement, Date date_Recensement, boolean export,
									long CodeOper, long CodeUP) {
					this.IDRecensement = IDRecensement;
					this.date_Recensement = date_Recensement;
					this.export = export;
					this.CodeOper = CodeOper;
					this.CodeUP = CodeUP;
	}

	public int getIDRecensement() {
					return this.IDRecensement;
	}

	public void setIDRecensement(int IDRecensement) {
					this.IDRecensement = IDRecensement;
	}

	public Date getDate_Recensement() {
					return this.date_Recensement;
	}

	public void setDate_Recensement(Date date_Recensement) {
					this.date_Recensement = date_Recensement;
	}

	public boolean getExport() {
					return this.export;
	}

	public void setExport(boolean export) {
					this.export = export;
	}

	public long getCodeOper() {
					return this.CodeOper;
	}

	public void setCodeOper(long CodeOper) {
					this.CodeOper = CodeOper;
	}

	public long getCodeUP() {
					return this.CodeUP;
	}

	public void setCodeUP(long CodeUP) {
					this.CodeUP = CodeUP;
	}

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

	/** To-one relationship, resolved on first access. */
	@Generated(hash = 1674099008)
	public UniteProduction getUniteProduction() {
					long __key = this.CodeUP;
					if (uniteProduction__resolvedKey == null
													|| !uniteProduction__resolvedKey.equals(__key)) {
									final DaoSession daoSession = this.daoSession;
									if (daoSession == null) {
													throw new DaoException("Entity is detached from DAO context");
									}
									UniteProductionDao targetDao = daoSession.getUniteProductionDao();
									UniteProduction uniteProductionNew = targetDao.load(__key);
									synchronized (this) {
													uniteProduction = uniteProductionNew;
													uniteProduction__resolvedKey = __key;
									}
					}
					return uniteProduction;
	}

	/** called by internal mechanisms, do not call yourself. */
	@Generated(hash = 648376472)
	public void setUniteProduction(@NotNull UniteProduction uniteProduction) {
					if (uniteProduction == null) {
									throw new DaoException(
																	"To-one property 'CodeUP' has not-null constraint; cannot set to-one to null");
					}
					synchronized (this) {
									this.uniteProduction = uniteProduction;
									CodeUP = uniteProduction.getCodeUP();
									uniteProduction__resolvedKey = CodeUP;
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
	@Generated(hash = 872207511)
	public void __setDaoSession(DaoSession daoSession) {
		this.daoSession = daoSession;
		myDao = daoSession != null ? daoSession.getRecensementDao() : null;
	}

	
}