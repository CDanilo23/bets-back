package com.bets;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bets.model.Bet;
import com.bets.model.Hourse;
import com.bets.model.Hipodromo;

@Component
public class BetCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		
		hipodromoRepository.findAll().forEach(hipo->System.out.println(hipo.getName()));
		betrepository.findAll().forEach(bet->System.out.println(bet.getName()));
		tipoApuestaRepository.findAll().forEach(item->System.out.println(item.getName()));
		monedaRepository.findAll().forEach(moneda->System.out.println(moneda.getName()));
		montoRepository.findAll().forEach(monto-> System.out.println(monto.getName()));
		parrillaRepository.findAll().forEach(parri->{ 
//			for(Hourse carrera : parri.getHourses()) {
//				System.out.println(carrera.getHourse1());
//			}
		});
	}
	
	@Autowired
	BetRepository betrepository;
	
	@Autowired
	HipodromoRepository hipodromoRepository;
	
	@Autowired
	TipoApuestaRepository tipoApuestaRepository;
	
	@Autowired
	MonedaRepository monedaRepository;
	
	@Autowired
	MontoRepository montoRepository;
	
	@Autowired
	RaceRepository parrillaRepository;
}
