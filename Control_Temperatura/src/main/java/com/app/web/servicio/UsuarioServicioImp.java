package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Usuarios;
import com.app.web.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImp implements UsuarioServicio{
	
	@Autowired
	private UsuarioRepositorio repositorio;

	@Override
	public List<Usuarios> listarTodoslosUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuarios guardarusuarios(Usuarios usuarios) {
		return repositorio.save(usuarios);
	}

	@Override
	public Usuarios obtenerusuarioPorId(Integer id) {
		return repositorio.findById(id).get();		
	}

	@Override
	public Usuarios actualizarusuarios(Usuarios usuarios) {
		return repositorio.save(usuarios);
	}

	@Override
	public void eliminarusuario(Integer id) {
		repositorio.deleteById(id);
		
	}
	

}
