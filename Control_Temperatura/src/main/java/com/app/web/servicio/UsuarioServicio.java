package com.app.web.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.web.entidad.Usuarios;

@Service
public interface UsuarioServicio {
	
	public List<Usuarios> listarTodoslosUsuarios();
	
	public Usuarios guardarusuarios(Usuarios usuarios);
	
	public Usuarios obtenerusuarioPorId(Integer id);
	
	public Usuarios actualizarusuarios(Usuarios usuarios);
	
	public void eliminarusuario(Integer id);

}
