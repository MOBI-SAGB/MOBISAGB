package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the TypeDG database table.
 * 
 */
@Entity
public class TypeDG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_TypeDG;

	private String intituleDG;

	private String typeDG;

	public TypeDG() {
	}

	@Generated(hash = 501506519)
	public TypeDG(int id_TypeDG, String intituleDG, String typeDG) {
					this.id_TypeDG = id_TypeDG;
					this.intituleDG = intituleDG;
					this.typeDG = typeDG;
	}

	public int getId_TypeDG() {
		return this.id_TypeDG;
	}

	public void setId_TypeDG(int id_TypeDG) {
		this.id_TypeDG = id_TypeDG;
	}

	public String getIntituleDG() {
		return this.intituleDG;
	}

	public void setIntituleDG(String intituleDG) {
		this.intituleDG = intituleDG;
	}

	public String getTypeDG() {
		return this.typeDG;
	}

	public void setTypeDG(String typeDG) {
		this.typeDG = typeDG;
	}

}