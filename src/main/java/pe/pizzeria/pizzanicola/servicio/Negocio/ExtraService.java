package pe.pizzeria.pizzanicola.servicio.Negocio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.model.Extra;

@Service
public interface ExtraService {

	public List<Extra> lstExtra();
	public void guardar(Extra extra);
	public void actualizar(String id,Extra extra);
	public void eliminar(String id);
}
