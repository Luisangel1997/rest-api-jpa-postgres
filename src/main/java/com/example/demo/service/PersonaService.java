package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaResporitory;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaResporitory personaResporitory;
	
	public Persona create (Persona persona) {
		return personaResporitory.save(persona);
	}
	
	public List<Persona> getAllPersonas() {
		return personaResporitory.findAll();
	}
	
	public void delete (Persona persona) {
		personaResporitory.delete(persona);
	}
	
	public Optional<Persona> findById (Long id) {
		return personaResporitory.findById(id);
	}
		
}
