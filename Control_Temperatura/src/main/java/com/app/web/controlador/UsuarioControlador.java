package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.repositorio.UsuarioRepositorio;

@Controller
public class UsuarioControlador {

	@Autowired 
	private UsuarioRepositorio repositorio;
	
	@GetMapping("/Usuarios")
	public String listarusuarios() {
		return "usuarios";
	} 
}
