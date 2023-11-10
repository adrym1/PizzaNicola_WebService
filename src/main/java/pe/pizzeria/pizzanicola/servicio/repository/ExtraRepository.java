package pe.pizzeria.pizzanicola.servicio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pe.pizzeria.pizzanicola.servicio.model.Extra;
import java.util.List;


@Repository
public interface ExtraRepository extends MongoRepository<Extra, String>{
	List<Extra> findByDescripcionContainingIgnoreCase(String descripcion);
}
