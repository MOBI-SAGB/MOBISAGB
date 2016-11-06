package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the ResultatDG database table.
 * 
 */
@Entity
public class ResultatDG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_RsltDG;

	private String intituleRltDG;

	private String resultatDG;

	public ResultatDG() {
	}

	@Generated(hash = 933870938)
	public ResultatDG(int id_RsltDG, String intituleRltDG, String resultatDG) {
					this.id_RsltDG = id_RsltDG;
					this.intituleRltDG = intituleRltDG;
					this.resultatDG = resultatDG;
	}

	public int getId_RsltDG() {
		return this.id_RsltDG;
	}

	public void setId_RsltDG(int id_RsltDG) {
		this.id_RsltDG = id_RsltDG;
	}

	public String getIntituleRltDG() {
		return this.intituleRltDG;
	}

	public void setIntituleRltDG(String intituleRltDG) {
		this.intituleRltDG = intituleRltDG;
	}

	public String getResultatDG() {
		return this.resultatDG;
	}

	public void setResultatDG(String resultatDG) {
		this.resultatDG = resultatDG;
	}

}