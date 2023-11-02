package pe.pizzeria.pizzanicola.servicio.NegocioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.Negocio.TipoMasaService;
import pe.pizzeria.pizzanicola.servicio.model.TipoMasa;
import pe.pizzeria.pizzanicola.servicio.repository.TipoMasaRepository;

@Service
public class TipoMasaSImple implements TipoMasaService{

	@Autowired
	private TipoMasaRepository repository;
	
	@Override
	public List<TipoMasa> lstTipoMasa() {
		return repository.findAll();
	}

	@Override
	public void guardar(TipoMasa tipomasa) {
		repository.save(tipomasa);
	}

	@Override
	public void actualizar(String id, TipoMasa tipomasa) {
		TipoMasa obj = repository.findById(id).get();
		if(obj != null) {
			obj.setDescripcion(tipomasa.getDescripcion());
			repository.save(obj);
		}
		
	}

	@Override
	public void eliminar(String id) {

		Optional<TipoMasa> obj = repository.findById(id);
		if(obj.isPresent()) {
			repository.delete(obj.get());
		}
		
	}

}
