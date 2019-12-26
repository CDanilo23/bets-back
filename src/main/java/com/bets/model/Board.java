package com.bets.model;

public class Board {
	
	private Integer id;
	private Integer idHipodromo;
	private Boolean races [][];
	
	public Board() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean[][] getRaces() {
		return races;
	}

	public Integer getIdHipodromo() {
		return idHipodromo;
	}

	public void setIdHipodromo(Integer idHipodromo) {
		this.idHipodromo = idHipodromo;
	}

	public void setRaces(Boolean[][] races) {
		this.races = races;
	}
	
	
}
