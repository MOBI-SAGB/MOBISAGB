package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the TypeEvenement database table.
 * 
 */
@Entity
public class TypeEvenement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_TypeEven;

	private String codeEven;

	private String intituleEven;

	public TypeEvenement() {
	}

	@Generated(hash = 1507465125)
	public TypeEvenement(int id_TypeEven, String codeEven, String intituleEven) {
					this.id_TypeEven = id_TypeEven;
					this.codeEven = codeEven;
					this.intituleEven = intituleEven;
	}

	public int getId_TypeEven() {
		return this.id_TypeEven;
	}

	public void setId_TypeEven(int id_TypeEven) {
		this.id_TypeEven = id_TypeEven;
	}

	public String getCodeEven() {
		return this.codeEven;
	}

	public void setCodeEven(String codeEven) {
		this.codeEven = codeEven;
	}

	public String getIntituleEven() {
		return this.intituleEven;
	}

	public void setIntituleEven(String intituleEven) {
		this.intituleEven = intituleEven;
	}

}