package com.bets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Monto {

	@Id
	@GeneratedValue
	private Integer idmonto;
	private String name;
	private Double valor;
	
	
	public Monto() {
		super();
	}
	
	public Integer getIdmonto() {
		return idmonto;
	}

	public void setIdmonto(Integer idmonto) {
		this.idmonto = idmonto;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
}
