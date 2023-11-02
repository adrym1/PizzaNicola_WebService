package pe.pizzeria.pizzanicola.servicio.Negocio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.model.TipoMasa;

@Service
public interface TipoMasaService {

	public List<TipoMasa> lstTipoMasa();
	public void guardar(TipoMasa tipomasa);
	public void actualizar(String id,TipoMasa tipomasa);
	public void eliminar(String id);
}
