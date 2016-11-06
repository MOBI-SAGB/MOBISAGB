package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the Vehicule database table.
 * 
 */
@Entity
public class Vehicule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int IDVehicule;

	private String matricule_Vehicule;

	public Vehicule() {
	}

	@Generated(hash = 135029135)
	public Vehicule(int IDVehicule, String matricule_Vehicule) {
					this.IDVehicule = IDVehicule;
					this.matricule_Vehicule = matricule_Vehicule;
	}

	public int getIDVehicule() {
		return this.IDVehicule;
	}

	public void setIDVehicule(int IDVehicule) {
		this.IDVehicule = IDVehicule;
	}

	public String getMatricule_Vehicule() {
		return this.matricule_Vehicule;
	}

	public void setMatricule_Vehicule(String matricule_Vehicule) {
		this.matricule_Vehicule = matricule_Vehicule;
	}

}