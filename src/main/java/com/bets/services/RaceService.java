package com.bets.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bets.RaceRepository;
import com.bets.model.Board;
import com.bets.model.Hourse;
import com.bets.model.Race;

@Service
public class RaceService {
	
	Logger log = LoggerFactory.getLogger(RaceService.class);
	
	@Autowired
	RaceRepository raceRepository;
	
	public void createBoard(Board board) {
		
		Race race;
		Hourse hourse;
		List<Hourse> hourses = new ArrayList<>();
		List<Race> races = new ArrayList<>();
		
		for (int i = 0; i < board.getRaces().length; i++) {

			for (int j = 0; j < board.getRaces()[i].length; j++) {
				hourse = new Hourse();
				if(board.getRaces()[i][j]) {
					hourse.setNumHourse(j+1);
					hourses.add(hourse);
				}
			}
			race = new Race();
			race.setHourses(hourses);
			race.setIdhipodromo(board.getIdHipodromo());
			hourses = new ArrayList<>();
			races.add(race);
		}
		
		
		try {
			races.forEach(race1 -> {
				race1.getHourses().forEach(hourse1 -> {
					hourse1.setRace(race1);
				});
				raceRepository.save(race1);
			});
		} catch (Exception e) {
			log.info(" Error saving info %s"+ e.getMessage());
			e.printStackTrace();
		}
		
	}

	public List<Race> listBoards() {
		return raceRepository.findAll();
	}
	
	
	
}
