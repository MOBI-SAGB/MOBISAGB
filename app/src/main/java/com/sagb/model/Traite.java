package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the Traites database table.
 * 
 */
@Entity
public class Traite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Traite;

	private String intitTraite;

	public Traite() {
	}

	@Generated(hash = 635555981)
	public Traite(int id_Traite, String intitTraite) {
					this.id_Traite = id_Traite;
					this.intitTraite = intitTraite;
	}

	public int getId_Traite() {
		return this.id_Traite;
	}

	public void setId_Traite(int id_Traite) {
		this.id_Traite = id_Traite;
	}

	public String getIntitTraite() {
		return this.intitTraite;
	}

	public void setIntitTraite(String intitTraite) {
		this.intitTraite = intitTraite;
	}

}