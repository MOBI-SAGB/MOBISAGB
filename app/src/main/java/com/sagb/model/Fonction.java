package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;

/**
 * The persistent class for the Fonctions database table.
 * 
 */
@Entity
public class Fonction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codeFonct;

	private String intitFonction;

	public Fonction() {
	}

	@Generated(hash = 1760667079)
	public Fonction(int codeFonct, String intitFonction) {
					this.codeFonct = codeFonct;
					this.intitFonction = intitFonction;
	}

	public int getCodeFonct() {
		return this.codeFonct;
	}

	public void setCodeFonct(int codeFonct) {
		this.codeFonct = codeFonct;
	}

	public String getIntitFonction() {
		return this.intitFonction;
	}

	public void setIntitFonction(String intitFonction) {
		this.intitFonction = intitFonction;
	}

}