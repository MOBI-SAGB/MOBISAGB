package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the SessionIdentReforme database table.
 * 
 */
@Entity
public class SessionIdentReforme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id_SessReforme;

	private int codeOper;

	private int codeUP;

	private Date date_Session;

	private boolean export;

	public SessionIdentReforme() {
	}

	@Generated(hash = 400512905)
	public SessionIdentReforme(long id_SessReforme, int codeOper, int codeUP,
									Date date_Session, boolean export) {
					this.id_SessReforme = id_SessReforme;
					this.codeOper = codeOper;
					this.codeUP = codeUP;
					this.date_Session = date_Session;
					this.export = export;
	}

	public long getId_SessReforme() {
		return this.id_SessReforme;
	}

	public void setId_SessReforme(long id_SessReforme) {
		this.id_SessReforme = id_SessReforme;
	}

	public int getCodeOper() {
		return this.codeOper;
	}

	public void setCodeOper(int codeOper) {
		this.codeOper = codeOper;
	}

	public int getCodeUP() {
		return this.codeUP;
	}

	public void setCodeUP(int codeUP) {
		this.codeUP = codeUP;
	}

	public Date getDate_Session() {
		return this.date_Session;
	}

	public void setDate_Session(Date date_Session) {
		this.date_Session = date_Session;
	}

	public boolean getExport() {
		return this.export;
	}

	public void setExport(boolean export) {
		this.export = export;
	}

}