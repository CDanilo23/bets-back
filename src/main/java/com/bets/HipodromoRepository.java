package com.bets;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bets.model.Hipodromo;

import java.lang.String;
import java.util.List;
import java.lang.Integer;

public interface HipodromoRepository extends JpaRepository<Hipodromo, Long>{
	
	List<Hipodromo> findByName(String name);
	
	Hipodromo findByIdhipodromo(Integer id);
	
}
