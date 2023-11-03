package pe.pizzeria.pizzanicola.servicio.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pizza")
public class Pizza {

	private String id;
	private String nombrePizza;
	private String ingredientes;
	private String tamanio;
	private String tipoMasa;
	private double precio;
	private int stock;

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombrePizza() {
		return nombrePizza;
	}


	public void setNombrePizza(String nombrePizza) {
		this.nombrePizza = nombrePizza;
	}


	public String getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}


	public String getTamanio() {
		return tamanio;
	}


	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}


	public String getTipoMasa() {
		return tipoMasa;
	}


	public void setTipoMasa(String tipoMasa) {
		this.tipoMasa = tipoMasa;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Pizza() {
		super();
	}
    
	
}
