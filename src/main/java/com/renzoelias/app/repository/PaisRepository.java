package com.renzoelias.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.renzoelias.app.model.Pais;

@Repository
public interface PaisRepository extends JpaRepositoryImplementation<Pais, Long> {
}

