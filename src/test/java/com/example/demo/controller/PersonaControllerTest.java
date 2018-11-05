package com.example.demo.controller;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.demo.MAvhaApplication;
import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MAvhaApplication.class })
@WebAppConfiguration
public class PersonaControllerTest {

	@Autowired
	private PersonaService personaService;
	
	@Test
	public void getPersonasNotEmpty() {
		List<Persona> listaPersonas = personaService.getPersonas();
		assertTrue(!listaPersonas.isEmpty());
	}
	
	@Test
	public void getPersonasEmpty() {
		List<Persona> listaPersonas = personaService.getPersonas();
		assertTrue(listaPersonas.isEmpty());
	}
	
	@Test
	public void createPersona() {
		Persona p = new Persona();
		p.setDni(12345678);
		p.setNombre("Armando");
		p.setApellido("Esteban Quito");
		p.setEdad(67);
		Persona nuevaPersona = personaService.addPersona(p);
		assertTrue(nuevaPersona.getDni() == 12345678);
	}

}
