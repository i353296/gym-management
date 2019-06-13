package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@Column
	private Integer mem_id;

	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	@Column
	private String mem_name;
}
