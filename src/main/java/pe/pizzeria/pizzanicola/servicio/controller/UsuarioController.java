package pe.pizzeria.pizzanicola.servicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.pizzeria.pizzanicola.servicio.Negocio.UsuarioService;
import pe.pizzeria.pizzanicola.servicio.model.Usuario;

@RestController
@RequestMapping("api/nicola/usuarios")
@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService services;
	
	@GetMapping("/")
	public List<Usuario> listar(){
		return services.lstUsuario();
	}
	
	@PostMapping("/usuario")
	public void registrar(@Validated @RequestBody Usuario usuario) {
		 services.guardar(usuario);
	}
	
	@PutMapping("/usuario/{id}")
	public void actualizar(@PathVariable String id, @Validated @RequestBody Usuario usuario) {
		services.actualizar(id, usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void eliminar (@PathVariable String id) {
		services.eliminar(id);
		}
}
