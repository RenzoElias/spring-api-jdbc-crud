package com.renzoelias.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renzoelias.app.model.Estado;
import com.renzoelias.app.service.EstadoService;

@RestController
@RequestMapping("/estados/")
public class EstadoREST {
	// Este caso no es un simple LIST
	// Listar los estados, solo del Pais que el usuario este consultando

	@Autowired
	private EstadoService estadoService;
	
	// Recibir una Lista (ya que Service su funcion obtendra ese tipo de lista)
	@GetMapping("{id}") // "/estados/{id}"
	private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable("id") Long idPais){ // es Mala Practica usar int, en su lugar es Long
		// El PathVariable("id") hace que el id recibido por GetMapping("{id}"), se asigne al parametro idPais
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
	}
	
}
