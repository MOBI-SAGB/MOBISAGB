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
 * The persistent class for the SessionControle database table.
 * 
 */
@Entity
public class SessionControle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="Id_SessCL")
	private long id_SessCL;

	@Property(nameInDb="DateControle")
	private Date dateControle;

	private String HCntrlMatin;

	private String HCntrlMidi;

	private String HCntrlSoir;

	@Property(nameInDb="SNIT")
	private boolean snit;

	public long getCodeUP() {
		return CodeUP;
	}

	public void setCodeUP(long codeUP) {
		CodeUP = codeUP;
	}

	@Property(nameInDb="CodeUP")
	private long CodeUP;

	@Property(nameInDb="TypeControle")
	private String typeControle;




	//bi-directional many-to-one association to UniteProduction
	@ToOne(joinProperty = "CodeUP")
	private UniteProduction uniteProduction;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 2018615941)
	private transient SessionControleDao myDao;

	@Generated(hash = 2054519328)
	private transient Long uniteProduction__resolvedKey;

	public SessionControle() {
	}

	@Generated(hash = 991774632)
	public SessionControle(long id_SessCL, Date dateControle, String HCntrlMatin,
									String HCntrlMidi, String HCntrlSoir, boolean snit, long CodeUP,
									String typeControle) {
					this.id_SessCL = id_SessCL;
					this.dateControle = dateControle;
					this.HCntrlMatin = HCntrlMatin;
					this.HCntrlMidi = HCntrlMidi;
					this.HCntrlSoir = HCntrlSoir;
					this.snit = snit;
					this.CodeUP = CodeUP;
					this.typeControle = typeControle;
	}
	@Keep
	public long getId_SessCL() {
		return this.id_SessCL;
	}
	@Keep
	public void setId_SessCL(long id_SessCL) {
		this.id_SessCL = id_SessCL;
	}
	@Keep
	public Date getDateControle() {
		return this.dateControle;
	}
	@Keep
	public void setDateControle(Date dateControle) {
		this.dateControle = dateControle;
	}
	@Keep
	public String getHCntrlMatin() {
		return this.HCntrlMatin;
	}
	@Keep
	public void setHCntrlMatin(String HCntrlMatin) {
		this.HCntrlMatin = HCntrlMatin;
	}
	@Keep
	public String getHCntrlMidi() {
		return this.HCntrlMidi;
	}
	@Keep
	public void setHCntrlMidi(String HCntrlMidi) {
		this.HCntrlMidi = HCntrlMidi;
	}
	@Keep
	public String getHCntrlSoir() {
		return this.HCntrlSoir;
	}
	@Keep
	public void setHCntrlSoir(String HCntrlSoir) {
		this.HCntrlSoir = HCntrlSoir;
	}
	@Keep
	public boolean getSnit() {
		return this.snit;
	}
	@Keep
	public void setSnit(boolean snit) {
		this.snit = snit;
	}
	@Keep
	public String getTypeControle() {
		return this.typeControle;
	}
	@Keep
	public void setTypeControle(String typeControle) {
		this.typeControle = typeControle;
	}

	@Keep
	public UniteProduction getUniteProduction() {
		return this.uniteProduction;
	}
	@Keep
	public void setUniteProduction(UniteProduction uniteProduction) {
		this.uniteProduction = uniteProduction;
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
	@Generated(hash = 527797208)
	public void __setDaoSession(DaoSession daoSession) {
					this.daoSession = daoSession;
					myDao = daoSession != null ? daoSession.getSessionControleDao() : null;
	}

}