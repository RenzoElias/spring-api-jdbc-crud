package com.renzoelias.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "persona") // Cuando haga mapeo(conexion) en la BD, se creara esta tabla desde Spring
public class Persona {
		//la bd lo detecte como id
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) // Auto Incrementable
		private Long id;
		//@Column(name="nombre_completo") // para que en la BD tenga nombre diferente al backend
		private String nombre;
		private String apellido;
		private int edad;
		// Relacion muchas a uno // many to one
		// Una persona tiene un pais // Un pais tiene a muchas personas
		// tabla persona _muchas __a__ un_ tabla Pais
		@ManyToOne
		@JoinColumn (name="id_pais") // id Pais de la persona, para que este como PK en el Pais
		private Pais pais;
		@ManyToOne
		@JoinColumn (name="id_estado")
		private Estado estado;
		
		public Persona() {
		}
		
		// sin id porque es un autoincrementable se inicializa solo
		public Persona(String nombre, String apellido, int edad, Pais pais, Estado estado) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.pais = pais;
			this.estado = estado;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public Pais getPais() {
			return pais;
		}
		public void setPais(Pais pais) {
			this.pais = pais;
		}
		public Estado getEstado() {
			return estado;
		}
		public void setEstado(Estado estado) {
			this.estado = estado;
		}

}
