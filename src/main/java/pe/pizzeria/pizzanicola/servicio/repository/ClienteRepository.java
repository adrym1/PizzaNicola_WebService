package pe.pizzeria.pizzanicola.servicio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pe.pizzeria.pizzanicola.servicio.model.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
	Cliente findByDni(String dni);
}
