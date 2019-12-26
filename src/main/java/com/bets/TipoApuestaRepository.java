package com.bets;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bets.model.Tipoapuesta;

import java.lang.String;
import java.util.List;
import java.lang.Integer;

public interface TipoApuestaRepository extends JpaRepository<Tipoapuesta, Long>{
	Tipoapuesta findByidtipoapuesta(Integer id);
	List<Tipoapuesta> findByName(String name);
}
