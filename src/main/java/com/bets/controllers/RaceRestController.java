package com.bets.controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bets.model.Board;
import com.bets.model.Race;
import com.bets.services.RaceService;

@RestController
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
public class RaceRestController {
	
	@Autowired
	RaceService raceService;
	
	@PostMapping(produces="application/json", value = "/board" )
	public void createBoard(@RequestBody Board board) {
		
		raceService.createBoard(board);
	}
	
	@GetMapping(produces="application/json", value = "/board" )
	public List<Race> findAllRaces(){
		return raceService.listBoards();
	}
	
	
}
