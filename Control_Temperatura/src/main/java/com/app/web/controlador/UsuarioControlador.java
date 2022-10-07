package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Area;
import com.app.web.entidad.Usuarios;
import com.app.web.servicio.AreaServicio;
import com.app.web.servicio.UsuarioServicio;


@Controller
public class UsuarioControlador {

	@Autowired(required = false)
	private UsuarioServicio servicio;
	
	@Autowired(required = false)
	private AreaServicio areaservicio;
	
	@GetMapping("/area")
	public String listararea(Model modelo) {
		modelo.addAttribute("area", areaservicio.listarTodasLasAreas());
		return "area";
	}  
	
	@GetMapping("/area/nuevo")
	public String crearareaformulario(Model modelo) {
		Area area = new Area();
		modelo.addAttribute("area", area);
		return "crear_area";
	} 
	
	@PostMapping("area")
	public String guardarArea(@ModelAttribute("area") Area area) {
		areaservicio.guardararea(area);
		return "redirect:/area";
	}

	@GetMapping("/area/editar/{id}")
	public String editarAreaForm(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("area", areaservicio.obtenerareasPorId(id));
		return "editar_area";
	}
	
	@PostMapping("/area/{id}")
	public String actualizaArea(@PathVariable Integer id, @ModelAttribute("area") Area areas, Model modelo) {
		Area area = areaservicio.obtenerareasPorId(id);
		area.setId(id);
		area.setnombrearea(areas.getnombrearea());
		
		areaservicio.actualizararea(area);
		
		return "redirect:/area";
	}
	
	@GetMapping("area/{id}")
	public String eliminarArea(@PathVariable Integer id) {
		areaservicio.eliminararea(id);
		return "redirect:/area";
	}

	
	
	
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
		modelo.addAttribute("area", areaservicio.listarTodasLasAreas());		
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
	
	@GetMapping("usuarios/{id}")
	public String eliminarUsuario(@PathVariable Integer id) {
		servicio.eliminarusuario(id);
		return "redirect:/usuarios";
	}
	
	@PostMapping("/arearesearch")
    public String areaPost(@ModelAttribute("area") Area area) {
        return "arearesearch";
    }
	
	
}
