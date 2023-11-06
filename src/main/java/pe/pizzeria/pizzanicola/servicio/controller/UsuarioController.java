package pe.pizzeria.pizzanicola.servicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.pizzeria.pizzanicola.servicio.model.Usuario;
import pe.pizzeria.pizzanicola.servicio.repository.UsuarioRepository;

@RestController
@RequestMapping("api/nicola/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/")
	public List<Usuario> listar(){
		return repository.findAll();
	}
	
	@PostMapping("/usuario")
	public Usuario registrar(@Validated @RequestBody Usuario usuario) {
		 return repository.insert(usuario);
	}
	
	@PutMapping("/usuario/{id}")
	public Usuario actualizar(@PathVariable String id, @Validated @RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void eliminar (@PathVariable String id) {
		repository.deleteById(id);
	}
}
