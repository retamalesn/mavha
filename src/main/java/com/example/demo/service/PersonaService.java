package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;

	public List<Persona> getPersonas(){
		return personaRepository.findAll();
	}
	
	public Persona addPersona(Persona persona) {
		return personaRepository.save(persona);
	}
}
