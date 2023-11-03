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

import pe.pizzeria.pizzanicola.servicio.Negocio.InsumoService;
import pe.pizzeria.pizzanicola.servicio.model.Insumo;

@RestController
@RequestMapping("api/nicola/insumos")
@Controller
public class InsumosController {


	@Autowired
	private InsumoService services;
	
	@GetMapping("/")
	public List<Insumo> listar(){
		return services.lstInsumos();
	}
	
	@PostMapping("/insumo")
	public void registrar(@Validated @RequestBody Insumo insumo) {
		 services.guardar(insumo);
	}
	
	@PutMapping("/insumo/{id}")
	public void actualizar(@PathVariable String id, @Validated @RequestBody Insumo insumo) {
		services.actualizar(id, insumo);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void eliminar (@PathVariable String id) {
		services.eliminar(id);
		}
}
