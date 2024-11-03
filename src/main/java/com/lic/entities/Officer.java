package com.lic.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Officer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "officer_id")
  private int ofid;
  private String name;

	public int getOfid() {
		return ofid;
	}

	public void setOfid(int ofid) {
		this.ofid = ofid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Officer [ofid=" + ofid + ", name=" + name + "]";
	}

	public Officer(int ofid, String name) {
		super();
		this.ofid = ofid;
		this.name = name;
	}

	public Officer() {
		super();
		// TODO Auto-generated constructor stub
	}
  
}
