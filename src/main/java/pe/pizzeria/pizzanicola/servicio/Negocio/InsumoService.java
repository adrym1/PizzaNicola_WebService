package pe.pizzeria.pizzanicola.servicio.Negocio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.model.Insumos;

@Service
public interface InsumoService {

	public List<Insumos> lstInsumos();
	public void guardar(Insumos insumos);
	public void actualizar(String id,Insumos insumos);
	public void eliminar(String id);
}
