package com.pokecontrol.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pokecontrol.models.Entrenador;

public interface Entrenador_Repository extends CrudRepository<Entrenador, Long> {

	Entrenador findFirstByEmail(String email);
	
	
	
}
