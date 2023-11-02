package pe.pizzeria.pizzanicola.servicio.NegocioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.pizzeria.pizzanicola.servicio.Negocio.RegionService;
import pe.pizzeria.pizzanicola.servicio.model.Region;
import pe.pizzeria.pizzanicola.servicio.repository.RegionRepository;

@Service
public class RegionSImple implements RegionService{

	@Autowired
	RegionRepository repository;
	@Override
	public List<Region> lstRegion() {
		return repository.findAll();
	}

	@Override
	public void guardar(Region region) {
		repository.save(region);
		
	}

	@Override
	public void actualizar(String id, Region region) {
		Region obj = repository.findById(id).get();
		if(obj != null) {
			obj.setNomRegion(region.getNomRegion());
			repository.save(obj);
		}
	}

	@Override
	public void eliminar(String id) {
		Optional<Region> obj = repository.findById(id);
		if(obj.isPresent()) {
			repository.delete(obj.get());
		}
		
	}

}
