package pe.pizzeria.pizzanicola.servicio.NegocioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.Negocio.PizzaService;
import pe.pizzeria.pizzanicola.servicio.model.Pizza;
import pe.pizzeria.pizzanicola.servicio.repository.PizzaRepository;

@Service
public class PizzaSImple implements PizzaService{

	@Autowired
	PizzaRepository pizzaRepository;
	
	@Override
	public List<Pizza> lstPizza() {
		return pizzaRepository.findAll();
	}

	@Override
	public void guardar(Pizza pizza) {
		pizzaRepository.save(pizza);
		
	}

	@Override
	public void actualizar(String id, Pizza pizza) {
		Pizza obj = pizzaRepository.findById(id).get();
		if(obj != null) {
			obj.setNombrePizza(pizza.getNombrePizza());
			obj.setIngredientes(pizza.getIngredientes());
			obj.setIdTamanio(pizza.getIdTamanio());
			obj.setTamanio(pizza.getTamanio());
			obj.setIdTipoMasa(pizza.getIdTipoMasa());
			obj.setTipoMasa(pizza.getTipoMasa());
			obj.setIdExtra(pizza.getIdExtra());
			obj.setPrecio(pizza.getPrecio());
			obj.setStock(pizza.getStock());
			pizzaRepository.save(obj);
		}
		
	}

	@Override
	public void eliminar(String id) {

		Optional<Pizza> obj = pizzaRepository.findById(id);
		if(obj.isPresent()) {
			pizzaRepository.delete(obj.get());
		}
		
	}

}
