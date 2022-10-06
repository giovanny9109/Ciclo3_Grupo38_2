package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Usuarios;
import com.app.web.repositorio.UsuarioRepositorio;

@SpringBootApplication
public class Control_TemperaturaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Control_TemperaturaApplication.class, args);
	}

	@Autowired
	private UsuarioRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*Usuarios usuario1 = new Usuarios(null, null, null, "Cadena1", "Area1", 12, "Sin observacion1");
		repositorio.save(usuario1);

		Usuarios usuario2 = new Usuarios(null, null, null, "Cadena2", "Area2", 12, "Sin observacion2");
        repositorio.save(usuario2);*/
		
	}


}
