package pe.pizzeria.pizzanicola.servicio.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pe.pizzeria.pizzanicola.servicio.model.Pizza;

@Repository
public interface PizzaRepository extends MongoRepository<Pizza, String>{
	List<Pizza> findByNombrePizzaContainingIgnoreCase(String nombrePizza);
}
