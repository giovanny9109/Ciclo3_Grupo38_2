package com.app.web.entidad;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table  (name = "usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre", nullable = true)
	private String nombre;
	@Column()
	private Integer identificacion;	
	@Column(name = "email", nullable = false, length = 120)
	private String email;
	
	
	
	public Usuarios() {
	}

	public Usuarios(Integer id, String nombre, String apellido, Integer identificacion, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.email = email;
	}

	public Usuarios(String nombre, String apellido, Integer identificacion, String email) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.email = email;
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

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", identificacion="
				+ identificacion + ", email=" + email + "]";
	}
	
	
	
	
}

