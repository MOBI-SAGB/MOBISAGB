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
 * The persistent class for the DetSessCL database table.
 * 
 */
@Entity
public class DetSessCL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="Id_DetSessCL")
	private int id_DetSessCL;

	@Property(nameInDb="Id_Animal")
	private long id_Animal;

	@Property(nameInDb="NumEchant")
	private int numEchant;

	@Property(nameInDb="Id_SessCL")
	private long Id_SessCL;

	//bi-directional many-to-one association to SessionControle
	@ToOne(joinProperty = "Id_SessCL")
	private SessionControle sessionControle;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 1655528271)
	private transient DetSessCLDao myDao;

	@Generated(hash = 668279048)
	private transient Long sessionControle__resolvedKey;

	public DetSessCL() {
	}
	@Generated(hash = 1807043580)
	public DetSessCL(int id_DetSessCL, long id_Animal, int numEchant,
									long Id_SessCL) {
					this.id_DetSessCL = id_DetSessCL;
					this.id_Animal = id_Animal;
					this.numEchant = numEchant;
					this.Id_SessCL = Id_SessCL;
	}
	@Keep
	public int getId_DetSessCL() {
		return this.id_DetSessCL;
	}
	@Keep
	public void setId_DetSessCL(int id_DetSessCL) {
		this.id_DetSessCL = id_DetSessCL;
	}
	@Keep
	public long getId_Animal() {
		return this.id_Animal;
	}
	@Keep
	public void setId_Animal(long id_Animal) {
		this.id_Animal = id_Animal;
	}
	@Keep
	public int getNumEchant() {
		return this.numEchant;
	}
	@Keep
	public void setNumEchant(int numEchant) {
		this.numEchant = numEchant;
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
	@Generated(hash = 261316017)
	public void __setDaoSession(DaoSession daoSession) {
					this.daoSession = daoSession;
					myDao = daoSession != null ? daoSession.getDetSessCLDao() : null;
	}
}