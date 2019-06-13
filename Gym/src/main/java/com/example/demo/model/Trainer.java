package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {

	@Id
	@Column
	private Integer trnr_id;
	
	@Column
	private String trnr_name;
	
	@Column
	private String trnr_activity;
	
	@Column
	private String trnr_trne;

	public Integer getTrnr_id() {
		return trnr_id;
	}

	public void setTrnr_id(Integer trnr_id) {
		this.trnr_id = trnr_id;
	}

	public String getTrnr_name() {
		return trnr_name;
	}

	public void setTrnr_name(String trnr_name) {
		this.trnr_name = trnr_name;
	}

	public String getTrnr_activity() {
		return trnr_activity;
	}

	public void setTrnr_activity(String trnr_activity) {
		this.trnr_activity = trnr_activity;
	}

	public String getTrnr_trne() {
		return trnr_trne;
	}

	public void setTrnr_trne(String trnr_trne) {
		this.trnr_trne = trnr_trne;
	}
	
	
}
