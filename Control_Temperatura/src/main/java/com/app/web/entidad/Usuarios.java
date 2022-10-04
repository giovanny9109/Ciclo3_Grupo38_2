package com.app.web.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table  (name = "usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "fecha", nullable = true)
	private Date fecha;
	@Column()
	private Float temperatura;
	@Column()
	private Float humedad;
	@Column(name = "cadenaFrio", nullable = false, length = 120)
	private String cadenaFrio;
	@Column(name = "areaOperativa", nullable = false, length = 120)
	private String areaOperativa;
	@Column(name = "encargadoid")
	private Integer encargadoid;
	@Column(name = "observacion", nullable = false, length = 120)
	private String observacion;
	
	public Usuarios(Integer id, Date fecha, Float temperatura, Float humedad, String cadenaFrio, String areaOperativa,
			Integer encargadoID, String observacion) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.cadenaFrio = cadenaFrio;
		this.areaOperativa = areaOperativa;
		this.encargadoid = encargadoID;
		this.observacion = observacion;
	}

	public Usuarios(Date fecha, Float temperatura, Float humedad, String cadenaFrio, String areaOperativa,
			Integer encargadoID, String observacion) {
		super();
		this.fecha = fecha;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.cadenaFrio = cadenaFrio;
		this.areaOperativa = areaOperativa;
		this.encargadoid = encargadoID;
		this.observacion = observacion;
	}

	public Usuarios() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}

	public Float getHumedad() {
		return humedad;
	}

	public void setHumedad(Float humedad) {
		this.humedad = humedad;
	}

	public String getCadenaFrio() {
		return cadenaFrio;
	}

	public void setCadenaFrio(String cadenaFrio) {
		this.cadenaFrio = cadenaFrio;
	}

	public String getAreaOperativa() {
		return areaOperativa;
	}

	public void setAreaOperativa(String areaOperativa) {
		this.areaOperativa = areaOperativa;
	}

	public Integer getEncargadoID() {
		return encargadoid;
	}

	public void setEncargadoID(Integer encargadoID) {
		this.encargadoid = encargadoID;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", fecha=" + fecha + ", temperatura=" + temperatura + ", humedad=" + humedad
				+ ", cadenaFrio=" + cadenaFrio + ", areaOperativa=" + areaOperativa + ", encargadoID=" + encargadoid
				+ ", observacion=" + observacion + "]";
	}
	
	
	
	
	
	
}

