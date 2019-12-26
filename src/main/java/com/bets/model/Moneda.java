package com.bets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Moneda {
	
	@Id
	@GeneratedValue
	private Integer idmoneda;
	private String name;
	private Integer valor;
	private Double valordolar;
	
	
	public Moneda() {
		super();
	}
	
	public Integer getIdmoneda() {
		return idmoneda;
	}

	public void setIdmoneda(Integer idmoneda) {
		this.idmoneda = idmoneda;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Double getValordolar() {
		return valordolar;
	}
	public void setValordolar(Double valordolar) {
		this.valordolar = valordolar;
	}
	
}
