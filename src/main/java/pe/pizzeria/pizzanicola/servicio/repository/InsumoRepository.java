package pe.pizzeria.pizzanicola.servicio.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pe.pizzeria.pizzanicola.servicio.model.Insumo;

@Repository
public interface InsumoRepository extends MongoRepository<Insumo, String>{
	List<Insumo> findByNombreInsumoContainingIgnoreCase(String nombreInsumo);
}
