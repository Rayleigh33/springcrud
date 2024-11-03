package com.lic.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "license")
public class License {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;
   private String type;
   private int duration;
   @OneToOne(cascade = CascadeType.ALL)
   private Officer officer;

	public License(int id, String name, String type, int duration, Officer officer) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.duration = duration;
	this.officer = officer;
}

	

	public License() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "License [id=" + id + ", name=" + name + ", type=" + type + ", duration=" + duration + ", officer="
				+ officer + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
   
	public Officer getOfficer() {
		return officer;
	}

	public void setOfficer(Officer officer) {
		this.officer = officer;
	}
  
}
