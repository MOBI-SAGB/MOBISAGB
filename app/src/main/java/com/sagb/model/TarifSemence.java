package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the TarifSemences database table.
 * 
 */
@Entity
public class TarifSemence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_ChoixSem;

	private String nomChoix;

	private int PV_Adh1;

	private int PV_AdhN;

	private int PV_Part1;

	private int PV_PartN;

	public TarifSemence() {
	}

	@Generated(hash = 326745448)
	public TarifSemence(int id_ChoixSem, String nomChoix, int PV_Adh1, int PV_AdhN,
									int PV_Part1, int PV_PartN) {
					this.id_ChoixSem = id_ChoixSem;
					this.nomChoix = nomChoix;
					this.PV_Adh1 = PV_Adh1;
					this.PV_AdhN = PV_AdhN;
					this.PV_Part1 = PV_Part1;
					this.PV_PartN = PV_PartN;
	}

	public int getId_ChoixSem() {
		return this.id_ChoixSem;
	}

	public void setId_ChoixSem(int id_ChoixSem) {
		this.id_ChoixSem = id_ChoixSem;
	}

	public String getNomChoix() {
		return this.nomChoix;
	}

	public void setNomChoix(String nomChoix) {
		this.nomChoix = nomChoix;
	}

	public int getPV_Adh1() {
		return this.PV_Adh1;
	}

	public void setPV_Adh1(int PV_Adh1) {
		this.PV_Adh1 = PV_Adh1;
	}

	public int getPV_AdhN() {
		return this.PV_AdhN;
	}

	public void setPV_AdhN(int PV_AdhN) {
		this.PV_AdhN = PV_AdhN;
	}

	public int getPV_Part1() {
		return this.PV_Part1;
	}

	public void setPV_Part1(int PV_Part1) {
		this.PV_Part1 = PV_Part1;
	}

	public int getPV_PartN() {
		return this.PV_PartN;
	}

	public void setPV_PartN(int PV_PartN) {
		this.PV_PartN = PV_PartN;
	}

}