package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.entidad.Usuarios;
import com.app.web.servicio.UsuarioServicio;


@Controller
public class UsuarioControlador {

	@Autowired 
	private UsuarioServicio servicio;
	
	@GetMapping("/index")
	public String index(){
		return "index";
	}
	
	@GetMapping("/usuarios")
	public String listarusuarios(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarTodoslosUsuarios());
		return "usuarios";
	} 
	
	@GetMapping("/usuarios/nuevo")
	public String crearusuarioformulario(Model modelo) {
		Usuarios usuario = new Usuarios();
		modelo.addAttribute("usuarios", usuario);
		return "crear_usuario";
	} 
}
