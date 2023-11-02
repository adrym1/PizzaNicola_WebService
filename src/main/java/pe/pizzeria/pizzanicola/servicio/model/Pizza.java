package pe.pizzeria.pizzanicola.servicio.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pizza")
public class Pizza {

	private String idPizza;
	private String nombrePizza;
	private String ingredientes;
	private String idTamanio;
	private String tamanio;
	private String idTipoMasa;
	private String tipoMasa;
	private String idExtra;
	private String extra;
	private double precio;
	private int stock;
	public String getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(String idPizza) {
		this.idPizza = idPizza;
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
	public String getIdTamanio() {
		return idTamanio;
	}
	public void setIdTamanio(String idTamanio) {
		this.idTamanio = idTamanio;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getIdTipoMasa() {
		return idTipoMasa;
	}
	public void setIdTipoMasa(String idTipoMasa) {
		this.idTipoMasa = idTipoMasa;
	}
	public String getTipoMasa() {
		return tipoMasa;
	}
	public void setTipoMasa(String tipoMasa) {
		this.tipoMasa = tipoMasa;
	}
	public String getIdExtra() {
		return idExtra;
	}
	public void setIdExtra(String idExtra) {
		this.idExtra = idExtra;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
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
