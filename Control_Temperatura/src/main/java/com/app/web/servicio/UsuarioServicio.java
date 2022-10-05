package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Usuarios;

public interface UsuarioServicio {
	
	public List<Usuarios> listarTodoslosUsuarios();
	
	public Usuarios guardarusuarios(Usuarios usuarios);
	
	public Usuarios obtenerusuarioPorId(Integer id);
	
	public Usuarios actualizarusuarios(Usuarios usuarios);
	
	public void eliminarusuario(Integer id);

}
