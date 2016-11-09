package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.io.Serializable;


/**
 * The persistent class for the Adherents database table.
 * 
 */
@Entity(nameInDb ="Adherents" )
public class Adherent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb = "id_Adh" )
	private long id_Adh;

	@Property(nameInDb = "codeAdh" )
	private String codeAdh;

	@Property(nameInDb = "id_TypeAdh" )
	private int id_TypeAdh;

	@Property(nameInDb = "nomAdh" )
	private String nomAdh;


	public Adherent() {
	}

	@Generated(hash = 1766081554)
	public Adherent(long id_Adh, String codeAdh, int id_TypeAdh, String nomAdh) {
					this.id_Adh = id_Adh;
					this.codeAdh = codeAdh;
					this.id_TypeAdh = id_TypeAdh;
					this.nomAdh = nomAdh;
	}

	public long getId_Adh() {
		return this.id_Adh;
	}

	public void setId_Adh(long id_Adh) {
		this.id_Adh = id_Adh;
	}

	public String getCodeAdh() {
		return this.codeAdh;
	}

	public void setCodeAdh(String codeAdh) {
		this.codeAdh = codeAdh;
	}

	public int getId_TypeAdh() {
		return this.id_TypeAdh;
	}

	public void setId_TypeAdh(int id_TypeAdh) {
		this.id_TypeAdh = id_TypeAdh;
	}

	public String getNomAdh() {
		return this.nomAdh;
	}

	public void setNomAdh(String nomAdh) {
		this.nomAdh = nomAdh;
	}

	@Override
	public String toString() {
		return nomAdh;
	}
}