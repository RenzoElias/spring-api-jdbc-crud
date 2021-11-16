package com.renzoelias.app.service;

import java.util.List;

import com.renzoelias.app.model.Pais;


public interface PruebaServices {
	
	public String pruebaLista(Integer id);
	
	public List<Pais> obtenerLista(Integer id);
}
