package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the Type_Perte database table.
 * 
 */
@Entity
public class Type_Perte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long IDType_Perte;

	private String libelle_TypePerte;

	public Type_Perte() {
	}

	@Generated(hash = 1199671783)
	public Type_Perte(long IDType_Perte, String libelle_TypePerte) {
					this.IDType_Perte = IDType_Perte;
					this.libelle_TypePerte = libelle_TypePerte;
	}

	public long getIDType_Perte() {
		return this.IDType_Perte;
	}

	public void setIDType_Perte(long IDType_Perte) {
		this.IDType_Perte = IDType_Perte;
	}

	public String getLibelle_TypePerte() {
		return this.libelle_TypePerte;
	}

	public void setLibelle_TypePerte(String libelle_TypePerte) {
		this.libelle_TypePerte = libelle_TypePerte;
	}

}