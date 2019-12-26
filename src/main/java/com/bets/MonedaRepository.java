package com.bets;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bets.model.Moneda;

public interface MonedaRepository extends JpaRepository<Moneda, Long>{
	Moneda findByIdmoneda(Integer id);
}
