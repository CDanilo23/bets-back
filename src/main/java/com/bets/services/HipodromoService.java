package com.bets.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bets.HipodromoRepository;
import com.bets.model.Hipodromo;

@Service
public class HipodromoService {
	
	@Autowired
	HipodromoRepository hipodromoRepository;
	
	public List<Hipodromo> findAllHipodromos(){
		return hipodromoRepository.findAll();	
	}
}
