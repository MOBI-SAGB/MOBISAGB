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
 * The persistent class for the DecEvenements database table.
 * 
 */
@Entity
public class DecEvenement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="Id_DecEven")
	private int id_DecEven;

	@Property(nameInDb="DateDecEven")
	private Date dateDecEven;

	@Property(nameInDb = "CodeOper")
	private long CodeOper;

	@Property(nameInDb = "CodeUP")
	private long CodeUP;

	@Property(nameInDb = "Id_SessCL")
	private long Id_SessCL;

	//bi-directional many-to-one association to Operateur
	@ToOne(joinProperty = "CodeOper")
	private Operateur operateur;

	//bi-directional many-to-one association to SessionControle
	@ToOne(joinProperty = "Id_SessCL")
	private SessionControle sessionControle;

	//bi-directional many-to-one association to UniteProduction
	@ToOne(joinProperty = "CodeUP")
	private UniteProduction uniteProduction;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 570429610)
	private transient DecEvenementDao myDao;

	@Generated(hash = 67236089)
	private transient Long operateur__resolvedKey;

	@Generated(hash = 668279048)
	private transient Long sessionControle__resolvedKey;

	@Generated(hash = 2054519328)
	private transient Long uniteProduction__resolvedKey;

	public DecEvenement() {
	}
	@Generated(hash = 1534764334)
	public DecEvenement(int id_DecEven, Date dateDecEven, long CodeOper,
									long CodeUP, long Id_SessCL) {
					this.id_DecEven = id_DecEven;
					this.dateDecEven = dateDecEven;
					this.CodeOper = CodeOper;
					this.CodeUP = CodeUP;
					this.Id_SessCL = Id_SessCL;
	}
	@Keep
	public int getId_DecEven() {
		return this.id_DecEven;
	}
	@Keep
	public void setId_DecEven(int id_DecEven) {
		this.id_DecEven = id_DecEven;
	}
	@Keep
	public Date getDateDecEven() {
		return this.dateDecEven;
	}
	@Keep
	public void setDateDecEven(Date dateDecEven) {
		this.dateDecEven = dateDecEven;
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
	public SessionControle getSessionControle() {
		return this.sessionControle;
	}
	@Keep
	public void setSessionControle(SessionControle sessionControle) {
		this.sessionControle = sessionControle;
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
	public long getId_SessCL() {
		return Id_SessCL;
	}
	@Keep
	public void setId_SessCL(long id_SessCL) {
		Id_SessCL = id_SessCL;
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
	@Generated(hash = 1731358700)
	public void __setDaoSession(DaoSession daoSession) {
					this.daoSession = daoSession;
					myDao = daoSession != null ? daoSession.getDecEvenementDao() : null;
	}
}