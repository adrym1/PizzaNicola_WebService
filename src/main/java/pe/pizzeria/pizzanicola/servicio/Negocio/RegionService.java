package pe.pizzeria.pizzanicola.servicio.Negocio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.model.Region;

@Service
public interface RegionService {

	public List<Region> lstRegion();
	public void guardar(Region region);
	public void actualizar(String id,Region region);
	public void eliminar(String id);
}
