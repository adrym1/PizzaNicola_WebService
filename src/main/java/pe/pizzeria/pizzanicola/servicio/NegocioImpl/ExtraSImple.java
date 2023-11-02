package pe.pizzeria.pizzanicola.servicio.NegocioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.Negocio.ExtraService;
import pe.pizzeria.pizzanicola.servicio.model.Extra;
import pe.pizzeria.pizzanicola.servicio.repository.ExtraRepository;

@Service
public class ExtraSImple implements ExtraService{

	@Autowired
	private ExtraRepository extraRepository;
	
	@Override
	public List<Extra> lstExtra() {
		return extraRepository.findAll();
	}

	@Override
	public void guardar(Extra extra) {
		extraRepository.save(extra);
		
	}

	@Override
	public void actualizar(String id, Extra extra) {
		Extra obj = extraRepository.findById(id).get();
		if(obj != null) {
			obj.setDescripcion(extra.getDescripcion());
			extraRepository.save(extra);
		}
		
	}

	@Override
	public void eliminar(String id) {
		Optional<Extra> obj = extraRepository.findById(id);
		if(obj.isPresent()) {
			extraRepository.delete(obj.get());
		}
	}

}
