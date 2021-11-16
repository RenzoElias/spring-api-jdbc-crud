package com.renzoelias.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renzoelias.app.model.Pais;
import com.renzoelias.app.repository.PruebaListaRepository;

@Service
public class PruebaServicesImpl implements PruebaServices {
	@Autowired
	private PruebaListaRepository pruebaListaRepository;
	
	@Override
	public String pruebaLista(Integer id){
		String paises = pruebaListaRepository.pruebaLista(id);
		return paises;
	}
	
	@Override
	public List<Pais> obtenerLista(Integer id){
		List<Pais> paisesList = pruebaListaRepository.obtenerLista(id);
		return paisesList;
	}

}
