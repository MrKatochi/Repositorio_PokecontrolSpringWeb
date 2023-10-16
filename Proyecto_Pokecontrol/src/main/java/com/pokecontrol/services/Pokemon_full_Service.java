package com.pokecontrol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokecontrol.models.Pokemon_full;
import com.pokecontrol.repositories.Pokemon_full_Repository;

@Service
public class Pokemon_full_Service {
	@Autowired
	private Pokemon_full_Repository pokemon_full_repository;

	public Pokemon_full add(Pokemon_full e) {
		pokemon_full_repository.save(e);
		return e;
	}

	public List<Pokemon_full> findAll() {
		return (List<Pokemon_full>) pokemon_full_repository.findAll();

	}

	public Pokemon_full findById(long id) {
		return pokemon_full_repository.findById(id).get();
	}

	public Pokemon_full edit(Pokemon_full e) {
		pokemon_full_repository.save(e);
		return e;
	}

	public void deletePokemon(long id) {
		pokemon_full_repository.deleteById(id);
	}

}