package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/index/usuarios")
	public String redirect(){
		return "redirect:/usuarios";
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
	
	@PostMapping("usuarios")
	public String guardarUsuario(@ModelAttribute("usuarios") Usuarios usuarios) {
		servicio.guardarusuarios(usuarios);
		return "redirect:/usuarios";
	}

	@GetMapping("/usuarios/editar/{id}")
	public String editarusuarioForm(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("usuarios", servicio.obtenerusuarioPorId(id));
		return "editar_usuario";
	}
	
	@PostMapping("/usuarios/{id}")
	public String actualizaUsuario(@PathVariable Integer id, @ModelAttribute("usuarios") Usuarios usuarios, Model modelo) {
		Usuarios usuario = servicio.obtenerusuarioPorId(id);
		usuario.setId(id);
		usuario.setAreaOperativa(usuarios.getAreaOperativa());
		usuario.setCadenaFrio(usuarios.getCadenaFrio());
		usuario.setEncargadoID(usuarios.getEncargadoID());
		usuario.setFecha(usuarios.getFecha());
		usuario.setHumedad(usuarios.getHumedad());
		usuario.setObservacion(usuarios.getObservacion());
		usuario.setTemperatura(usuarios.getTemperatura());
		
		servicio.actualizarusuarios(usuario);
		
		return "redirect:/usuarios";
	}
	
	
}
