package com.bets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tipoapuesta {

	@Id
	@GeneratedValue
	Integer idtipoapuesta;
	String name;
	
	
	public Tipoapuesta(String name) {
		super();
		this.name = name;
	}
	public Tipoapuesta() {
		super();
	}

	public Integer getIdtipoapuesta() {
		return idtipoapuesta;
	}
	public void setIdtipoapuesta(Integer idtipoapuesta) {
		this.idtipoapuesta = idtipoapuesta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
