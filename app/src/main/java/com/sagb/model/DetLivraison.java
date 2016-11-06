package com.sagb.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.io.Serializable;


/**
 * The persistent class for the DetLivraison database table.
 * 
 */
@Entity
public class DetLivraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="Id_DetLivr")
	private int id_DetLivr;

	@Property(nameInDb="Export")
	private boolean export;

	@Property(nameInDb="QteLivr")
	private int qteLivr;

	@Property(nameInDb="Id_Livr")
	private long Id_Livr;

	@Property(nameInDb="Id_Semence")
	private long Id_Semence;

	//bi-directional many-to-one association to BonLivraison
	@ToOne(joinProperty = "Id_Livr")
	private BonLivraison bonLivraison;

	//bi-directional many-to-one association to Semence
	@ToOne(joinProperty = "Id_Semence")
	private Semence semence;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 67925519)
	private transient DetLivraisonDao myDao;

	@Generated(hash = 1498844066)
	private transient Long bonLivraison__resolvedKey;

	@Generated(hash = 93694676)
	private transient Long semence__resolvedKey;

	public DetLivraison() {
	}
	@Generated(hash = 1746118387)
	public DetLivraison(int id_DetLivr, boolean export, int qteLivr, long Id_Livr,
									long Id_Semence) {
					this.id_DetLivr = id_DetLivr;
					this.export = export;
					this.qteLivr = qteLivr;
					this.Id_Livr = Id_Livr;
					this.Id_Semence = Id_Semence;
	}
	@Keep
	public int getId_DetLivr() {
		return this.id_DetLivr;
	}
	@Keep
	public void setId_DetLivr(int id_DetLivr) {
		this.id_DetLivr = id_DetLivr;
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
	public int getQteLivr() {
		return this.qteLivr;
	}
	@Keep
	public void setQteLivr(int qteLivr) {
		this.qteLivr = qteLivr;
	}
	@Keep
	public BonLivraison getBonLivraison() {
		return this.bonLivraison;
	}
	@Keep
	public void setBonLivraison(BonLivraison bonLivraison) {
		this.bonLivraison = bonLivraison;
	}
	@Keep
	public Semence getSemence() {
		return this.semence;
	}
	@Keep
	public void setSemence(Semence semence) {
		this.semence = semence;
	}
	@Keep
	public long getId_Livr() {
		return Id_Livr;
	}
	@Keep
	public void setId_Livr(long id_Livr) {
		Id_Livr = id_Livr;
	}
	@Keep
	public long getId_Semence() {
		return Id_Semence;
	}
	@Keep
	public void setId_Semence(long id_Semence) {
		Id_Semence = id_Semence;
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
	@Generated(hash = 780600553)
	public void __setDaoSession(DaoSession daoSession) {
					this.daoSession = daoSession;
					myDao = daoSession != null ? daoSession.getDetLivraisonDao() : null;
	}
}