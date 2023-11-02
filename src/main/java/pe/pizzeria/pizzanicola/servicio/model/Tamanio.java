package pe.pizzeria.pizzanicola.servicio.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tamanio")
public class Tamanio {

	private String idTamanio;
	private String descripcion;
	
	public String getIdTamanio() {
		return idTamanio;
	}
	public void setIdTamanio(String idTamanio) {
		this.idTamanio = idTamanio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Tamanio() {
		super();
	}
	
	
}
