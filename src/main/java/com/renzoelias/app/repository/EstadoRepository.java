package com.renzoelias.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.renzoelias.app.model.Estado;

// <T, ID> => <Clase Model, Tipo de dato(para pasarle el ID)>
@Repository
public interface EstadoRepository extends JpaRepositoryImplementation<Estado, Long>{

}
