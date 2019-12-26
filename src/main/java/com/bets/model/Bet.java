package com.bets.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bet {
	

	@Id
	@GeneratedValue
	private Integer idbet;
	private String name;
  
	public Bet() {
		super();
	}
    
	public Bet(String name) {
		super();
		this.name = name;
	}

	public Integer getIdbet() {
		return idbet;
	}
	
	public void setIdbet(Integer idbet) {
		this.idbet = idbet;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
