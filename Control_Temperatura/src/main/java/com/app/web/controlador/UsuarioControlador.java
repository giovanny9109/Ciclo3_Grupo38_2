package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.servicio.UsuarioServicio;


@Controller
public class UsuarioControlador {

	@Autowired 
	private UsuarioServicio servicio;
	
	@GetMapping("/Usuarios")
	public String listarusuarios(Model modelo) {
		modelo.addAttribute("Usuario", servicio.listarTodoslosUsuarios());
		return "usuarios";
	} 
}
