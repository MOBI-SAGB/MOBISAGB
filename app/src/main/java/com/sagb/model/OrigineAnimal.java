package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the OrigineAnimal database table.
 * 
 */
@Entity
public class OrigineAnimal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_OrigAnim;

	private String intitOrigAnim;

	public OrigineAnimal() {
	}

	@Generated(hash = 678530973)
	public OrigineAnimal(int id_OrigAnim, String intitOrigAnim) {
					this.id_OrigAnim = id_OrigAnim;
					this.intitOrigAnim = intitOrigAnim;
	}

	public int getId_OrigAnim() {
		return this.id_OrigAnim;
	}

	public void setId_OrigAnim(int id_OrigAnim) {
		this.id_OrigAnim = id_OrigAnim;
	}

	public String getIntitOrigAnim() {
		return this.intitOrigAnim;
	}

	public void setIntitOrigAnim(String intitOrigAnim) {
		this.intitOrigAnim = intitOrigAnim;
	}

}