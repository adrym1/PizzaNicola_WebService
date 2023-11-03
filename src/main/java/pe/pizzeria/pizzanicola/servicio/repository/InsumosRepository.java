package pe.pizzeria.pizzanicola.servicio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pe.pizzeria.pizzanicola.servicio.model.Insumo;

@Repository
public interface InsumosRepository extends MongoRepository<Insumo, String>{

}
