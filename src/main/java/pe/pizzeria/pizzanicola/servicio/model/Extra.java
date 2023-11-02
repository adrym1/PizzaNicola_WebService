package pe.pizzeria.pizzanicola.servicio.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "extra")
public class Extra {
	
	private String idExtra;
	private String descripcion;
		
	public String getIdExtra() {
		return idExtra;
	}
	public void setIdExtra(String idExtra) {
		this.idExtra = idExtra;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Extra() {
		super();
	}
	
	

}
