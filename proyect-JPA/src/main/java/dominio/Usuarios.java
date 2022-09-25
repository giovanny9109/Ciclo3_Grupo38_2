package dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  (name = "usuarios")
public class Usuarios {
	
	@Id
	private Integer id;
	private Date fecha;
	private Float temperatura;
	private Float humedad;
	private String cadenaFrio;
	private String areaOperativa;
	private Integer encargadoID;
	private String oservacion;
	
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
		return encargadoID;
	}
	public void setEncargadoID(Integer encargadoID) {
		this.encargadoID = encargadoID;
	}
	public String getOservacion() {
		return oservacion;
	}
	public void setOservacion(String oservacion) {
		this.oservacion = oservacion;
	}
	
	//Constructor
	public Usuarios(Integer id, Date fecha, Float temperatura, Float humedad, String cadenaFrio, String areaOperativa,
			Integer encargadoID, String oservacion) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.cadenaFrio = cadenaFrio;
		this.areaOperativa = areaOperativa;
		this.encargadoID = encargadoID;
		this.oservacion = oservacion;
	}
	
	public Usuarios() {
		super();
	}
	
	public Usuarios(Integer id) {
		super();
		this.id = id;
	}
	
	//HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", fecha=" + fecha + ", temperatura=" + temperatura + ", humedad=" + humedad
				+ ", cadenaFrio=" + cadenaFrio + ", areaOperativa=" + areaOperativa + ", encargadoID=" + encargadoID
				+ ", oservacion=" + oservacion + "]";
	}
	
	
	
	
	
	
	

}
