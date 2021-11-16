package com.renzoelias.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.stereotype.Service;

import com.renzoelias.app.model.Estado;
import com.renzoelias.app.repository.EstadoRepository;

@Service
public class EstadoService implements EstadoRepository{
	
	// Crear de una inyeccion de este elemento sin necesidad de crear una instancia // osea el New EstadoRepository
	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public void setRepositoryMethodMetadata(CrudMethodMetadata crudMethodMetadata) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Estado> findAll() {
		// TODO Auto-generated method stub
		return estadoRepository.findAll();
	}
	
	public List<Estado> findAllByCountry(Long id) {
		List<Estado> estadosResponse = new ArrayList<>(); // Se inicializa asi vacio una List // Ayudarse con comando CTRL + SPACE
		List<Estado> estados = estadoRepository.findAll();
		// estados.get(i).getPais() 
		
		// get(i) metodo del Repository 
		//desde BD// row fila i //desde Spring// objeto i del Model Estado 
		
		// .getPais() metodo del Model (Table Estado) 
		//desde BD// Extrae su Respectiva Fila o Row de la Tabla Pais, gracias a la FK de Pais que esta dentro del Row de 1 fila de la Tabla Estado
		//desde Spring// Extrae su Model Pais, declarado dentro del Model Estado
		
		// .getId() metodo del Model Pais 
		//desde BD// Extrae su PK del Row i osea el id_pais
		//desde Spring// Extrae id del Model Pais declarado dentro del Modal Estado de posicion (i) del List
		
		for(int i=0; i<estados.size(); i++) {
//			if (estados.get(i).getPais().getId() == id ) {
//				estadosResponse.add(estados.get(i));
//			}
		}
		
		return estadosResponse;
	}

	@Override
	public List<Estado> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return estadoRepository.findAll(sort);
	}

	@Override
	public List<Estado> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Estado> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Estado> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estado getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Estado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Estado> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		estadoRepository.deleteById(id);
	}

	@Override
	public void delete(Estado entity) {
		// TODO Auto-generated method stub
		estadoRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Estado> entities) {
		// TODO Auto-generated method stub
		estadoRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		estadoRepository.deleteAll();
	}

	@Override
	public <S extends Estado> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Estado> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Estado> findOne(Specification<Estado> spec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estado> findAll(Specification<Estado> spec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Estado> findAll(Specification<Estado> spec, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estado> findAll(Specification<Estado> spec, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(Specification<Estado> spec) {
		// TODO Auto-generated method stub
		return 0;
	}

}
