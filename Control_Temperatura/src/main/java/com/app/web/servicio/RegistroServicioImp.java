package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Registro;
import com.app.web.repositorio.RegistroRepositorio;

@Service
public class RegistroServicioImp implements RegistroServicio {

	@Autowired
	private RegistroRepositorio repositorio;
	
	@Override
	public List<Registro> listarTodosLosRegistros() {
		return repositorio.findAll();
	}

	@Override
	public Registro guardarregistro(Registro registro) {
		return repositorio.save(registro);
	}

	@Override
	public Registro obtenerregistroPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Registro actualizarregistro(Registro registro) {
		return repositorio.save(registro);
	}

	@Override
	public void eliminarregistro(Integer id) {
		repositorio.deleteById(id);
		
	}

}
