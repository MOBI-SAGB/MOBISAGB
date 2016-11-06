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
 * The persistent class for the MAJ database table.
 * 
 */
@Entity
 public class Maj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="Id_Maj")
	private int id_Maj;

	@Property(nameInDb="Date_Maj")
	private Date date_Maj;

	@Property(nameInDb="Export")
	private boolean export;

	@Property(nameInDb="Fini")
	private boolean fini;

	@Property(nameInDb="Type_Maj")
	private boolean type_Maj;

	@Property(nameInDb="CodeOper")
	private long CodeOper;


	//bi-directional many-to-one association to Operateur
	@ToOne(joinProperty = "CodeOper" )
	private Operateur operateur;

	/** Used to resolve relations */
	@Generated(hash = 2040040024)
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	@Generated(hash = 617530233)
	private transient MajDao myDao;

	@Generated(hash = 67236089)
	private transient Long operateur__resolvedKey;

	@Keep
	public Maj() {
	}

	@Generated(hash = 821246689)
	public Maj(int id_Maj, Date date_Maj, boolean export, boolean fini,
									boolean type_Maj, long CodeOper) {
					this.id_Maj = id_Maj;
					this.date_Maj = date_Maj;
					this.export = export;
					this.fini = fini;
					this.type_Maj = type_Maj;
					this.CodeOper = CodeOper;
	}

	@Keep public int getId_Maj() {
		return this.id_Maj;
	}

	@Keep public void setId_Maj(int id_Maj) {
		this.id_Maj = id_Maj;
	}

	@Keep public Date getDate_Maj() {
		return this.date_Maj;
	}

	@Keep public void setDate_Maj(Date date_Maj) {
		this.date_Maj = date_Maj;
	}

	@Keep public boolean getExport() {
		return this.export;
	}

	@Keep public void setExport(boolean export) {
		this.export = export;
	}

	@Keep public boolean getFini() {
		return this.fini;
	}

	@Keep public void setFini(boolean fini) {
		this.fini = fini;
	}

	@Keep public boolean getType_Maj() {
		return this.type_Maj;
	}

	@Keep public void setType_Maj(boolean type_Maj) {
		this.type_Maj = type_Maj;
	}

	@Keep public Operateur getOperateur() {
		return this.operateur;
	}

	@Keep public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}

	@Keep public long getCodeOper() {
		return CodeOper;
	}

	@Keep public void setCodeOper(long codeOper) {
		CodeOper = codeOper;
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
	@Generated(hash = 1978756562)
	public void __setDaoSession(DaoSession daoSession) {
					this.daoSession = daoSession;
					myDao = daoSession != null ? daoSession.getMajDao() : null;
	}
}