package com.bets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hipodromo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idhipodromo;
	String name;

	public Hipodromo() {
		super();
	}

	public Hipodromo(String name) {
		super();
		this.name = name;
	}

	public Integer getIdhipodromo() {
		return idhipodromo;
	}

	public void setIdhipodromo(Integer idhipodromo) {
		this.idhipodromo = idhipodromo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
