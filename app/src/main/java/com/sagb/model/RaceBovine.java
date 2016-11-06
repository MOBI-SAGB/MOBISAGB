package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the RaceBovine database table.
 * 
 */
@Entity
public class RaceBovine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Race;

	private String codeRace;

	private String intituleRace;

	public RaceBovine() {
	}

	@Generated(hash = 933670924)
	public RaceBovine(int id_Race, String codeRace, String intituleRace) {
					this.id_Race = id_Race;
					this.codeRace = codeRace;
					this.intituleRace = intituleRace;
	}

	public int getId_Race() {
		return this.id_Race;
	}

	public void setId_Race(int id_Race) {
		this.id_Race = id_Race;
	}

	public String getCodeRace() {
		return this.codeRace;
	}

	public void setCodeRace(String codeRace) {
		this.codeRace = codeRace;
	}

	public String getIntituleRace() {
		return this.intituleRace;
	}

	public void setIntituleRace(String intituleRace) {
		this.intituleRace = intituleRace;
	}

}