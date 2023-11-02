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

import pe.pizzeria.pizzanicola.servicio.Negocio.PizzaService;
import pe.pizzeria.pizzanicola.servicio.model.Pizza;

@RestController
@RequestMapping("api/nicola/pizzas")
@Controller
public class PizzaController {


	@Autowired
	private PizzaService services;
	
	@GetMapping("/")
	public List<Pizza> listar(){
		return services.lstPizza();
	}
	
	@PostMapping("/pizza")
	public void registrar(@Validated @RequestBody Pizza pizza) {
		 services.guardar(pizza);
	}
	
	@PutMapping("/pizza/{id}")
	public void actualizar(@PathVariable String id, @Validated @RequestBody Pizza pizza) {
		services.actualizar(id, pizza);
	}
	
	@DeleteMapping("/pizza/{id}")
	public void eliminar (@PathVariable String id) {
		services.eliminar(id);
		}
}
