package com.bets;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bets.model.Race;

public interface RaceRepository extends JpaRepository<Race, Long> {
	Race findByIdrace(Integer id);
	
	@Query("select r from Race r where r.idhipodromo = :idhipodromo and r.idrace = :idrace")
	Race findByHipodromo(@Param("idhipodromo") Integer idhipodromo, 
						 @Param("idrace") Integer idrace);
	
}
