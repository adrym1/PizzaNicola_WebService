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

import pe.pizzeria.pizzanicola.servicio.model.Insumo;
import pe.pizzeria.pizzanicola.servicio.repository.InsumoRepository;

@RestController
@RequestMapping("api/nicola/insumos")
public class InsumoController {
	@Autowired
	private InsumoRepository repository;
	
	@GetMapping("/")
	public List<Insumo> listar(){
		return repository.findAll();
	}
	
	@PostMapping("/insumo")
	public Insumo registrar(@Validated @RequestBody Insumo insumo) {
		 return repository.insert(insumo);
	}
	
	@PutMapping("/insumo/{id}")
	public Insumo actualizar(@PathVariable String id, @Validated @RequestBody Insumo insumo) {
		return repository.save(insumo);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void eliminar (@PathVariable String id) {
		repository.deleteById(id);
	}
}
