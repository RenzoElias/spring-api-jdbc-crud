package com.renzoelias.app.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renzoelias.app.service.PruebaServices;

@RestController
public class pruebaController {
	
	@Autowired
	public PruebaServices pruebaServices;

	
	@GetMapping("obtener-nombre")
	public ResponseEntity<Object> pruebaLista(Integer id) {
		Map<String, Object> respuesta = new HashMap<>();
		HttpStatus status = HttpStatus.OK;
		try {
			respuesta.put("result", pruebaServices.pruebaLista(id));
			respuesta.put("status", Boolean.TRUE);
			respuesta.put("codigo", status.value());
		} catch (Exception e) {
			status = HttpStatus.NOT_FOUND;
			respuesta.put("status", false);
			respuesta.put("errorMensaje", e.getMessage());
			respuesta.put("codigo", status.value());
		}
		return new ResponseEntity(respuesta, status);
	}
	
	@GetMapping("obtener-lista")
	public ResponseEntity<Object> obtenerListaPaises(Integer id) {
		Map<String, Object> respuesta = new HashMap<>();
		HttpStatus status = HttpStatus.OK;
		try {
			respuesta.put("result", pruebaServices.obtenerLista(id));
			respuesta.put("status", Boolean.TRUE);
			respuesta.put("codigo", status.value());
		} catch (Exception e) {
			status = HttpStatus.NOT_FOUND;
			respuesta.put("status", false);
			respuesta.put("errorMensaje", e.getMessage());
			respuesta.put("codigo", status.value());
		}
		return new ResponseEntity(respuesta, status);
	}

}
