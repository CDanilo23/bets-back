package com.bets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bets.model.Hipodromo;
import com.bets.services.HipodromoService;

@RestController
@CrossOrigin(allowedHeaders="*", allowCredentials="true")
public class HipodromoRestController {
	
	@Autowired
	HipodromoService hipodromoService;
	
	@GetMapping(produces="application/json", value="/hipodromo")
	public List<Hipodromo> listarHipodromos(){
		return hipodromoService.findAllHipodromos();
	}

}
