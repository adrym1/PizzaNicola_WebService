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

import pe.pizzeria.pizzanicola.servicio.Negocio.TamanioService;
import pe.pizzeria.pizzanicola.servicio.model.Tamanio;


@RestController
@RequestMapping("api/nicola/tamanios")
@Controller
public class TamanioController {

	@Autowired
	private TamanioService services;
	
	@GetMapping("/")
	public List<Tamanio> listar(){
		return services.lstTamanio();
	}
	
	@PostMapping("/tamanio")
	public void registrar(@Validated @RequestBody Tamanio tamanio) {
		 services.guardar(tamanio);
	}
	
	@PutMapping("/tamanio/{id}")
	public void actualizar(@PathVariable String id, @Validated @RequestBody Tamanio tamanio) {
		services.actualizar(id, tamanio);
	}
	
	@DeleteMapping("/tamanio/{id}")
	public void eliminar (@PathVariable String id) {
		services.eliminar(id);
		}
}
