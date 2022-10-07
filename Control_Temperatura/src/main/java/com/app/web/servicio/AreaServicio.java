package com.app.web.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.web.entidad.Area;

@Service
public interface AreaServicio {
	
	public List<Area> listarTodasLasAreas();
	
	public Area guardararea(Area area);
	
	public Area obtenerareasPorId(Integer id);
	
	public Area actualizararea(Area area);
	
	public void eliminararea(Integer id);

}
