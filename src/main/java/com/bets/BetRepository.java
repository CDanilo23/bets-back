package com.bets;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bets.model.Bet;

public interface BetRepository extends JpaRepository<Bet, Long> {
	
	Collection<Bet> findByName(String name);
	
	Bet findByIdbet(Integer id);
	
	@SuppressWarnings("unchecked")
	Bet save(Bet person);
}
