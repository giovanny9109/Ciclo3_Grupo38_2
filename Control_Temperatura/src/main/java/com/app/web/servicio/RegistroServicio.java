package com.app.web.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.web.entidad.Registro;

@Service
public interface RegistroServicio {
	
	public List<Registro> listarTodosLosRegistros();
	
	public Registro guardarregistro(Registro registro);
	
	public Registro obtenerregistroPorId(Integer id);
	
	public Registro actualizarregistro(Registro registro);
	
	public void eliminarregistro(Integer id);

}
