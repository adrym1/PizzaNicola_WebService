package pe.pizzeria.pizzanicola.servicio.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuario")
public class Usuario {

	private String idUsuario;
	private String nombres;
	private Date fechaNacimiento;
	private String dni;
	private String idRegion;
	private String nombreRegion;
	private String login;
	private String password;
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(String idRegion) {
		this.idRegion = idRegion;
	}
	public String getNombreRegion() {
		return nombreRegion;
	}
	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usuario() {
		super();
	}
	
	
}
