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

import pe.pizzeria.pizzanicola.servicio.Negocio.TipoMasaService;
import pe.pizzeria.pizzanicola.servicio.model.TipoMasa;

@RestController
@RequestMapping("api/nicola/tipomasas")
@Controller
public class TipoMasaController {

	@Autowired
	private TipoMasaService services;
	
	@GetMapping("/")
	public List<TipoMasa> listar(){
		return services.lstTipoMasa();
	}
	
	@PostMapping("/tipomasa")
	public void registrar(@Validated @RequestBody TipoMasa tipomasa) {
		 services.guardar(tipomasa);
	}
	
	@PutMapping("/tipomasa/{id}")
	public void actualizar(@PathVariable String id, @Validated @RequestBody  TipoMasa tipomasa) {
		services.actualizar(id, tipomasa);
	}
	
	@DeleteMapping("/tipomasa/{id}")
	public void eliminar (@PathVariable String id) {
		services.eliminar(id);
		}
}
