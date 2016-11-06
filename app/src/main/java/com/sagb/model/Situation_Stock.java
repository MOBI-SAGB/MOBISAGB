package com.sagb.model;


import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.io.Serializable;


/**
 * The persistent class for the Situation_Stock database table.
 * 
 */
@Entity
public class Situation_Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long IDSituation_Stock;

	@Property(nameInDb="Inventaire")
	private boolean inventaire;

	@Property(nameInDb="Qte_Dispo")
	private int qte_Dispo;

	@Property(nameInDb="Qte_Init")
	private int qte_Init;

	@Property(nameInDb="Qte_Invent")
	private int qte_Invent;

	@Property(nameInDb="Qte_Livraison")
	private int qte_Livraison;

	@Property(nameInDb="Qte_Perte")
	private int qte_Perte;

	@Property(nameInDb="Qte_Sortie")
	private int qte_Sortie;

	@Property(nameInDb="Qte_Transfert")
	private int qte_Transfert;

	@Property(nameInDb = "Id_Semence")
	private long Id_Semence;

	@Property(nameInDb = "Code_Op")
	private long Code_Op;

	//bi-directional many-to-one association to Operateur
	@ToOne(joinProperty = "Code_Op")
	private Operateur operateur;

	//bi-directional many-to-one association to Semence
	@ToOne(joinProperty = "Id_Semence")
	private Semence semence;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 264979471)
	private transient Situation_StockDao myDao;

	@Generated(hash = 1928117472)
	public Situation_Stock(long IDSituation_Stock, boolean inventaire,
									int qte_Dispo, int qte_Init, int qte_Invent, int qte_Livraison,
									int qte_Perte, int qte_Sortie, int qte_Transfert, long Id_Semence,
									long Code_Op) {
					this.IDSituation_Stock = IDSituation_Stock;
					this.inventaire = inventaire;
					this.qte_Dispo = qte_Dispo;
					this.qte_Init = qte_Init;
					this.qte_Invent = qte_Invent;
					this.qte_Livraison = qte_Livraison;
					this.qte_Perte = qte_Perte;
					this.qte_Sortie = qte_Sortie;
					this.qte_Transfert = qte_Transfert;
					this.Id_Semence = Id_Semence;
					this.Code_Op = Code_Op;
	}

	@Generated(hash = 547220198)
	public Situation_Stock() {
	}

	public long getIDSituation_Stock() {
					return this.IDSituation_Stock;
	}

	public void setIDSituation_Stock(long IDSituation_Stock) {
					this.IDSituation_Stock = IDSituation_Stock;
	}

	public boolean getInventaire() {
					return this.inventaire;
	}

	public void setInventaire(boolean inventaire) {
					this.inventaire = inventaire;
	}

	public int getQte_Dispo() {
					return this.qte_Dispo;
	}

	public void setQte_Dispo(int qte_Dispo) {
					this.qte_Dispo = qte_Dispo;
	}

	public int getQte_Init() {
					return this.qte_Init;
	}

	public void setQte_Init(int qte_Init) {
					this.qte_Init = qte_Init;
	}

	public int getQte_Invent() {
					return this.qte_Invent;
	}

	public void setQte_Invent(int qte_Invent) {
					this.qte_Invent = qte_Invent;
	}

	public int getQte_Livraison() {
					return this.qte_Livraison;
	}

	public void setQte_Livraison(int qte_Livraison) {
					this.qte_Livraison = qte_Livraison;
	}

	public int getQte_Perte() {
					return this.qte_Perte;
	}

	public void setQte_Perte(int qte_Perte) {
					this.qte_Perte = qte_Perte;
	}

	public int getQte_Sortie() {
					return this.qte_Sortie;
	}

	public void setQte_Sortie(int qte_Sortie) {
					this.qte_Sortie = qte_Sortie;
	}

	public int getQte_Transfert() {
					return this.qte_Transfert;
	}

	public void setQte_Transfert(int qte_Transfert) {
					this.qte_Transfert = qte_Transfert;
	}

	public long getId_Semence() {
					return this.Id_Semence;
	}

	public void setId_Semence(long Id_Semence) {
					this.Id_Semence = Id_Semence;
	}

	public long getCode_Op() {
					return this.Code_Op;
	}

	public void setCode_Op(long Code_Op) {
					this.Code_Op = Code_Op;
	}

	@Generated(hash = 67236089)
	private transient Long operateur__resolvedKey;

	/** To-one relationship, resolved on first access. */
	@Generated(hash = 2110474707)
	public Operateur getOperateur() {
					long __key = this.Code_Op;
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
	@Generated(hash = 18683580)
	public void setOperateur(@NotNull Operateur operateur) {
					if (operateur == null) {
									throw new DaoException(
																	"To-one property 'Code_Op' has not-null constraint; cannot set to-one to null");
					}
					synchronized (this) {
									this.operateur = operateur;
									Code_Op = operateur.getCodeOper();
									operateur__resolvedKey = Code_Op;
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
	@Generated(hash = 1614064958)
	public void __setDaoSession(DaoSession daoSession) {
		this.daoSession = daoSession;
		myDao = daoSession != null ? daoSession.getSituation_StockDao() : null;
	}

}