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

import pe.pizzeria.pizzanicola.servicio.model.Extra;
import pe.pizzeria.pizzanicola.servicio.repository.ExtraRepository;


@RestController
@RequestMapping("api/nicola/extras")
@Controller
public class ExtraController {

	@Autowired
	private ExtraRepository repository;
	
	@GetMapping("/")
	public List<Extra> listar(){
		return repository.findAll();
	}
	
	@PostMapping("/extra")
	public Extra registrar(@Validated @RequestBody Extra extra) {
		 return repository.insert(extra);
	}
	
	@PutMapping("/extra/{id}")
	public Extra actualizar(@PathVariable String id, @Validated @RequestBody Extra extra) {
		return repository.save(extra);
	}
	
	@DeleteMapping("/extra/{id}")
	public void eliminar (@PathVariable String id) {
		repository.deleteById(id);
	}
}
