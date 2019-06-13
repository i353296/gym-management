package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@Column
	private Integer ad_id;

	@Column
	private String ad_name;
	
	public Integer getAd_id() {
		return ad_id;
	}

	public void setAd_id(Integer ad_id) {
		this.ad_id = ad_id;
	}

	public String getAd_name() {
		return ad_name;
	}

	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}


}
