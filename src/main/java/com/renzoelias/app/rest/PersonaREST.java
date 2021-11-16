package com.renzoelias.app.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renzoelias.app.model.Persona;
import com.renzoelias.app.service.PersonaService;

@RestController
@RequestMapping("/personas/")
public class PersonaREST {
	// CRUD // Create // Read
	
	// Para usar los metodos del Service(Obtiene el resultado de la consulta del Repository) → Repository(Hace Consulta a la BD)
	@Autowired 
	PersonaService personaService;
	
	// READ
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas() {
		return ResponseEntity.ok(personaService.findAll());
	}
	
	// CREATE
	// savePersona es solo un nombre de metodo, puede ser cualquier otro nombre
	// @RequestBody es el body Json que envia el Front
	@PostMapping
	private ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
		try {
			// Se guarda a la BD la persona
			Persona personaGuardada = personaService.save(persona);
			
			// Retorno al front - en este caso sera retornado personaGuardada
			return ResponseEntity.created(new URI("/personas/"+persona.getId())).body(personaGuardada);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value="delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable("id") Long id){

		personaService.deleteById(id);
		
		//ResponseEntity.ok(true) // porque al buscar otra vez con findById, retornaria null != null, es false y luego true por el !false
		return ResponseEntity.ok(!(personaService.findById(id)!=null));
		
	}

}
