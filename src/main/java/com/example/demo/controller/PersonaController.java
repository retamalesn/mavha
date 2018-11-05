package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Persona> getPersonas() {
		return personaService.getPersonas();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Persona createCustomer(@Valid @RequestBody Persona persona) {
		return personaService.addPersona(persona);
	}

}
