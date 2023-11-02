package pe.pizzeria.pizzanicola.servicio.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "insumo")
public class Insumos {

    private String idInsumo;
    private String nombreInsumo;
    private String descripcion;
    private double precio;
    private int stock;
    
    
	public String getIdInsumo() {
		return idInsumo;
	}


	public void setIdInsumo(String idInsumo) {
		this.idInsumo = idInsumo;
	}


	public String getNombreInsumo() {
		return nombreInsumo;
	}


	public void setNombreInsumo(String nombreInsumo) {
		this.nombreInsumo = nombreInsumo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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


	public Insumos() {
		super();
	}
    
	
    
}
