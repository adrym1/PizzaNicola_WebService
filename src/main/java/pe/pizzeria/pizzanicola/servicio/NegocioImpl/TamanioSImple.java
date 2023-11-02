package pe.pizzeria.pizzanicola.servicio.NegocioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.Negocio.TamanioService;
import pe.pizzeria.pizzanicola.servicio.model.Tamanio;
import pe.pizzeria.pizzanicola.servicio.repository.TamanioRepository;

@Service
public class TamanioSImple implements TamanioService{

	@Autowired
	TamanioRepository repository;
	
	@Override
	public List<Tamanio> lstTamanio() {
		return repository.findAll();
	}

	@Override
	public void guardar(Tamanio tamanio) {
		repository.save(tamanio);
		
	}

	@Override
	public void actualizar(String id, Tamanio tamanio) {
		Tamanio obj = repository.findById(id).get();
		if(obj != null) {
			obj.setDescripcion(tamanio.getDescripcion());
			repository.save(obj);
		}
		
	}

	@Override
	public void eliminar(String id) {
		Optional<Tamanio> obj = repository.findById(id);
		if(obj.isPresent()) {
			repository.delete(obj.get());
		}
		
	}

}
