package pe.pizzeria.pizzanicola.servicio.controller;

import java.util.List;
import java.util.Optional;

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

import pe.pizzeria.pizzanicola.servicio.model.Pizza;
import pe.pizzeria.pizzanicola.servicio.repository.PizzaRepository;

@RestController
@RequestMapping("api/nicola/pizzas")
public class PizzaController {
	@Autowired
	//private PizzaService services;
	private PizzaRepository repository;
	
	@GetMapping("/")
	public List<Pizza> listar(){
		return repository.findAll();
	}
	
	@GetMapping("/pizza/{nombrePizza}")
	public List<Pizza> buscarPorNombre(@PathVariable String nombrePizza) {
		return repository.findByNombrePizzaContainingIgnoreCase(nombrePizza);
	}
	@GetMapping("/pizzaid/{id}")
	public Optional<Pizza> BuscarXid(@PathVariable String id) {
		return repository.findById(id);
	}
	
	@PostMapping("/pizza")
	public Pizza registrar(@Validated @RequestBody Pizza pizza) {
		 return repository.insert(pizza);
	}
	
	@PutMapping("/pizza/{id}")
	public Pizza actualizar(@PathVariable String id, @Validated @RequestBody Pizza pizza) {
		return repository.save(pizza);
	}
	
	@DeleteMapping("/pizza/{id}")
	public void eliminar (@PathVariable String id) {
		repository.deleteById(id);
	}
}
