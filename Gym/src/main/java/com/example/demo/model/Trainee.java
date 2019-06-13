package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@Id
	@Column
	private Integer trne_id;
	
	@Column
	private String trne_name;
	
	@Column
	private String trne_activity;
	
	@Column
	private String trne_trnr;

	public Integer getTrne_id() {
		return trne_id;
	}

	public void setTrne_id(Integer trne_id) {
		this.trne_id = trne_id;
	}

	public String getTrne_name() {
		return trne_name;
	}

	public void setTrne_name(String trne_name) {
		this.trne_name = trne_name;
	}

	public String getTrne_activity() {
		return trne_activity;
	}

	public void setTrne_activity(String trne_activity) {
		this.trne_activity = trne_activity;
	}

	public String getTrne_trnr() {
		return trne_trnr;
	}

	public void setTrne_trnr(String trne_trnr) {
		this.trne_trnr = trne_trnr;
	}
	
	

}
