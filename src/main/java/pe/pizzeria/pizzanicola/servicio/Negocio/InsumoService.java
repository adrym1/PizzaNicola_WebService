package pe.pizzeria.pizzanicola.servicio.Negocio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.model.Insumo;

@Service
public interface InsumoService {

	public List<Insumo> lstInsumos();
	public void guardar(Insumo insumos);
	public void actualizar(String id,Insumo insumos);
	public void eliminar(String id);
}
