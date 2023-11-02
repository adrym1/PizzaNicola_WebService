package pe.pizzeria.pizzanicola.servicio.NegocioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.Negocio.InsumoService;
import pe.pizzeria.pizzanicola.servicio.model.Insumos;
import pe.pizzeria.pizzanicola.servicio.repository.InsumosRepository;

@Service
public class InsumoSImple implements InsumoService{

	@Autowired
	InsumosRepository repository;
	@Override
	public List<Insumos> lstInsumos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Insumos insumos) {
		repository.save(insumos);
		
	}

	@Override
	public void actualizar(String id, Insumos insumos) {
		Insumos obj = repository.findById(id).get();
		if(obj != null) {
			obj.setNombreInsumo(insumos.getNombreInsumo());
			obj.setDescripcion(insumos.getDescripcion());
			obj.setPrecio(insumos.getPrecio());
			obj.setStock(insumos.getStock());
			repository.save(obj);
		}
	}

	@Override
	public void eliminar(String id) {	
		Optional<Insumos> obj = repository.findById(id);
	
		if(obj.isPresent()) {
		repository.delete(obj.get());
		}
		
	}

}
