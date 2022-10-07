package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Area;
import com.app.web.repositorio.AreaRepositorio;

@Service
public class AreaServicioImp implements AreaServicio{
	
	@Autowired
	private AreaRepositorio repositorio;

	@Override
	public List<Area> listarTodasLasAreas() {
		return repositorio.findAll();
	}

	@Override
	public Area guardararea(Area area) {
		return repositorio.save(area);
	}

	@Override
	public Area obtenerareasPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Area actualizararea(Area area) {
		return repositorio.save(area);
	}

	@Override
	public void eliminararea(Integer id) {
		repositorio.deleteById(id);
		
	}
}
