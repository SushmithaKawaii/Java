package com.example.demo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Username {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	
	private String name;
	private String city; 
	private String status;
	
	public Username(int uid, String name, String city, String status) {
		super();
		this.uid = uid;
		this.name = name;
		this.city = city;
		this.status = status;
	}


	@Override
	public String toString() {
		return "Username [uid=" + uid + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}

	public Username() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return uid;
	}

	public void setId(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	 

}
