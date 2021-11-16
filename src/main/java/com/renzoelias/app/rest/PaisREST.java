package com.renzoelias.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renzoelias.app.model.Pais;
import com.renzoelias.app.service.PaisService;

@RestController // Notacion para que sea REST
@RequestMapping("/pais") // Para dar la URL para acceder a este servicio
public class PaisREST {

	// Se necesita la propiedad de tipo service, ya que ahi esta los metodos que necesitaremos
	@Autowired
	private PaisService paisService;
	
	// Este va necesitar un ResponseEntity y para retornar una lista se define el tipo de retorno
	// Esto dice que estamos preparados para una peticion GET, poder dar una respuesta
	@GetMapping
	private ResponseEntity<List<Pais>> getAllPaises () {
		// Aqui hace la llamada al service y su metodo para el retorno
		return ResponseEntity.ok(paisService.findAll());
	}
	
}
