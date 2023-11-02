package pe.pizzeria.pizzanicola.servicio.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "region")
public class Region {

	private String idRegion;
	private String nomRegion;
	public String getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(String idRegion) {
		this.idRegion = idRegion;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public Region() {
		super();
	}
	
}
