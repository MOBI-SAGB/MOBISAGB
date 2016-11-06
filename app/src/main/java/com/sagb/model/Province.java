package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;


/**
 * The persistent class for the Province database table.
 * 
 */
@Entity
public class Province implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Province;

	private String lib_Province;

	public Province() {
	}

	@Generated(hash = 351207167)
	public Province(int id_Province, String lib_Province) {
					this.id_Province = id_Province;
					this.lib_Province = lib_Province;
	}

	public int getId_Province() {
		return this.id_Province;
	}

	public void setId_Province(int id_Province) {
		this.id_Province = id_Province;
	}

	public String getLib_Province() {
		return this.lib_Province;
	}

	public void setLib_Province(String lib_Province) {
		this.lib_Province = lib_Province;
	}

}