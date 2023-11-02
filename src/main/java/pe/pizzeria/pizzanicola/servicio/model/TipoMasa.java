package pe.pizzeria.pizzanicola.servicio.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tipoMasa")
public class TipoMasa {

	private String idTipoMasa;
	private String descripcion;
	
	public String getIdTipoMasa() {
		return idTipoMasa;
	}
	public void setIdTipoMasa(String idTipoMasa) {
		this.idTipoMasa = idTipoMasa;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public TipoMasa() {
		super();
	}
	
	
}
