package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.io.Serializable;


/**
 * The persistent class for the EtatAnimal database table.
 * 
 */
@Entity
public class EtatAnimal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb="CodeEtat")
	private int codeEtat;

	@Property(nameInDb="AbrEtat")
	private String abrEtat;

	@Property(nameInDb="DescEtat")
	private String descEtat;

	public EtatAnimal() {
	}

	@Generated(hash = 1365313386)
	public EtatAnimal(int codeEtat, String abrEtat, String descEtat) {
					this.codeEtat = codeEtat;
					this.abrEtat = abrEtat;
					this.descEtat = descEtat;
	}

	public int getCodeEtat() {
		return this.codeEtat;
	}

	public void setCodeEtat(int codeEtat) {
		this.codeEtat = codeEtat;
	}

	public String getAbrEtat() {
		return this.abrEtat;
	}

	public void setAbrEtat(String abrEtat) {
		this.abrEtat = abrEtat;
	}

	public String getDescEtat() {
		return this.descEtat;
	}

	public void setDescEtat(String descEtat) {
		this.descEtat = descEtat;
	}

}