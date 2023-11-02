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

import pe.pizzeria.pizzanicola.servicio.Negocio.RegionService;
import pe.pizzeria.pizzanicola.servicio.model.Region;

@RestController
@RequestMapping("api/nicola/regiones")
@Controller
public class RegionController {

	@Autowired
	private RegionService services;
	
	@GetMapping("/")
	public List<Region> listar(){
		return services.lstRegion();
	}
	
	@PostMapping("/region")
	public void registrar(@Validated @RequestBody Region region) {
		 services.guardar(region);
	}
	
	@PutMapping("/region/{id}")
	public void actualizar(@PathVariable String id, @Validated @RequestBody Region region) {
		services.actualizar(id, region);
	}
	
	@DeleteMapping("/region/{id}")
	public void eliminar (@PathVariable String id) {
		services.eliminar(id);
		}
}
