package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;
import org.greenrobot.greendao.annotation.Generated;


/**
 * The persistent class for the TB_Tiers database table.
 * 
 */
@Entity
public class TB_Tier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int IDTiers;

	private String label;

	private String matricule;

	public TB_Tier() {
	}

	@Generated(hash = 770589656)
	public TB_Tier(int IDTiers, String label, String matricule) {
					this.IDTiers = IDTiers;
					this.label = label;
					this.matricule = matricule;
	}

	public int getIDTiers() {
		return this.IDTiers;
	}

	public void setIDTiers(int IDTiers) {
		this.IDTiers = IDTiers;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

}