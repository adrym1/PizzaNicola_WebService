package pe.pizzeria.pizzanicola.servicio.Negocio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.model.Tamanio;

@Service
public interface TamanioService {

	public List<Tamanio> lstTamanio();
	public void guardar(Tamanio tamanio);
	public void actualizar(String id,Tamanio tamanio);
	public void eliminar(String id);
}
