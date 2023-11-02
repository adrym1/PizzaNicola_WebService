package pe.pizzeria.pizzanicola.servicio.Negocio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.model.Usuario;

@Service
public interface UsuarioService {

	public List<Usuario> lstUsuario();
	public void guardar(Usuario usuario);
	public void actualizar(String id,Usuario usuario);
	public void eliminar(String id);
}
