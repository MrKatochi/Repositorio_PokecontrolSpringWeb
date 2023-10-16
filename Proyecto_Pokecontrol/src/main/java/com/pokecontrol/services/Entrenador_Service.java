package com.pokecontrol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pokecontrol.models.Entrenador;
import com.pokecontrol.repositories.Entrenador_Repository;

@Service
public class Entrenador_Service {
	@Autowired
	Entrenador_Repository entrenador_repository;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	public Entrenador registrar(Entrenador u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return entrenador_repository.save(u);
	}

	public Entrenador findById(long id) {
		return entrenador_repository.findById(id).orElse(null);
	}

	public Entrenador buscarPorEmail(String email) {
		return entrenador_repository.findFirstByEmail(email);
	}
	
	

	public Entrenador add(Entrenador e) {
		entrenador_repository.save(e);
		// userDatabaseRepository.saveOrUpdate(user);
		return e;
	}

	public List<Entrenador> findAll() {
		return (List<Entrenador>) entrenador_repository.findAll();
	}

	public Entrenador edit(Entrenador e) {
		entrenador_repository.save(e);
		return e;
	}

	public void deleteUsuario(long id) {
		entrenador_repository.deleteById(id);
	}

}