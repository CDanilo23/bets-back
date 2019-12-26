package com.bets;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bets.model.Monto;

public interface MontoRepository extends JpaRepository<Monto, Long>{
	
	Monto findByIdmonto(Integer id);

}
