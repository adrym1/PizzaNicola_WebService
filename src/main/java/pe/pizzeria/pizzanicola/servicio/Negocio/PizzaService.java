package pe.pizzeria.pizzanicola.servicio.Negocio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.model.Pizza;

@Service
public interface PizzaService {

	public List<Pizza> lstPizza();
	public void guardar(Pizza pizza);
	public void actualizar(String id,Pizza pizza);
	public void eliminar(String id);
}
