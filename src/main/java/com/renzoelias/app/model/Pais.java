package com.renzoelias.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pais")
public class Pais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
//	private Long id; // Para JPA
	
	private String nombre;
	
	public Pais() {
	}
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
