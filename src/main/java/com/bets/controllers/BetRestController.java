package com.bets.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bets.BetRepository;
import com.bets.MonedaRepository;
import com.bets.MontoRepository;
import com.bets.RaceRepository;
import com.bets.TipoApuestaRepository;
import com.bets.model.Bet;
import com.bets.model.Moneda;
import com.bets.model.Monto;
import com.bets.model.Race;
import com.bets.model.Tipoapuesta;

@RestController
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
public class BetRestController {
		
	@Autowired
	BetRepository betRepository;
	
	@Autowired
	TipoApuestaRepository betTypeRepository;
	
	@Autowired
	MonedaRepository monedaRepository; 
	
	@Autowired
	MontoRepository montoRepository;
	
	@Autowired
	RaceRepository parrillaRepository;
	
	@GetMapping(produces="application/json",value="/bet")
	Collection<Bet> findAll(){
		return this.betRepository.findAll();
	}
	
	@GetMapping(produces="application/json",value="/bet/{id}")
	public Bet getStoryById(@PathVariable("id") int id) {
		return this.betRepository.findByIdbet(id);
	}
	
	@GetMapping(produces="application/json",value="/bettype")
	Collection<Tipoapuesta> findAllBetType(){
		return this.betTypeRepository.findAll();
	}
	
	@GetMapping(produces="application/json", value="/moneda")
	Collection<Moneda> findAllMonedas(){
		return this.monedaRepository.findAll();
	}
	
	@GetMapping(produces="application/json", value="/monto")
	Collection<Monto> findAllMontos(){
		return this.montoRepository.findAll();
	}
	
	@GetMapping(produces="application/json", value="/parrilla")
	String getParrilla() {
		
		List<Race> races = parrillaRepository.findAll();
		System.out.println(races);
		return "";
	}
	
	
	
//	@RequestMapping(consumes= {"application/json"} , value="/auth", method=RequestMethod.PUT)
//	public ResponseEntity<Story> authentication(@RequestBody Story story) {
//		System.out.println("Entro con nombre valor => "+person.getName());
//		System.out.println("Entro con nombre valor => "+person.getPassword());
//		person.setToken("12345");
//		return ResponseEntity.ok(person);
//	}
	
//	@RequestMapping(value="/persons/{id}",method=RequestMethod.PUT)
//	public ResponseEntity<Book> updateUser(@PathVariable("id") int id, @RequestBody Book person ){
//		System.out.println(id+person.toString());
//		Book currentPerson = personRepository.findById(id);
//		if(currentPerson==null) {
//			System.out.println(" Person with id => "+id+" doesn't found");
//			return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
//		}
//		
//		return  new ResponseEntity<Book>(HttpStatus.OK);
//	}
}
