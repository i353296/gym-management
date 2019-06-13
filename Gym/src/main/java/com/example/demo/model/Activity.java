package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {
	
	@Id
	@Column
	private Integer act_id;

	@Column
	private String act_name;

	public Integer getAct_id() {
		return act_id;
	}

	public void setAct_id(Integer act_id) {
		this.act_id = act_id;
	}

	public String getAct_name() {
		return act_name;
	}

	public void setAct_name(String act_name) {
		this.act_name = act_name;
	}
	

}
