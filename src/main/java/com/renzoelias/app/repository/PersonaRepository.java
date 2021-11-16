package com.renzoelias.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.renzoelias.app.model.Persona;

@Repository
public interface PersonaRepository  extends JpaRepositoryImplementation<Persona, Long>{

}
