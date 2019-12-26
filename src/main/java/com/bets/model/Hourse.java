package com.bets.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Hourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idhourse;
	
	@Column(name = "numhourse")
	Integer numHourse;

	
	@ManyToOne
	@JoinColumn(name="idrace")
	Race race;
	
	public Hourse() {
		super();
	}

	public Integer getIdhourse() {
		return idhourse;
	}

	public void setIdhourse(Integer idhourse) {
		this.idhourse = idhourse;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Integer getNumHourse() {
		return numHourse;
	}

	public void setNumHourse(Integer numHourse) {
		this.numHourse = numHourse;
	}
	
	

	
}
