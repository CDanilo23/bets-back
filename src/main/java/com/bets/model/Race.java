package com.bets.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Race {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idrace;
	
	@OneToMany(mappedBy="race", cascade=CascadeType.ALL,fetch=FetchType.EAGER)	
	List<Hourse> hourses;
	
	Integer idhipodromo;
	
	public Race() {
		super();
	}

	public Integer getIdrace() {
		return idrace;
	}

	public void setIdrace(Integer idrace) {
		this.idrace = idrace;
	}

	public List<Hourse> getHourses() {
		return hourses;
	}

	public void setHourses(List<Hourse> hourses) {
		this.hourses = hourses;
	}

	public Integer getIdhipodromo() {
		return idhipodromo;
	}

	public void setIdhipodromo(Integer idhipodromo) {
		this.idhipodromo = idhipodromo;
	}

}
