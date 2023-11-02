package pe.pizzeria.pizzanicola.servicio.NegocioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.pizzeria.pizzanicola.servicio.Negocio.UsuarioService;
import pe.pizzeria.pizzanicola.servicio.model.Usuario;
import pe.pizzeria.pizzanicola.servicio.repository.UsuarioRepository;

@Service
public class UsuarioSImple implements UsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public List<Usuario> lstUsuario() {
		return repository.findAll();
	}

	@Override
	public void guardar(Usuario usuario) {
		repository.save(usuario);
		
	}

	@Override
	public void actualizar(String id, Usuario usuario) {
		Usuario obj = repository.findById(id).get();
		if(obj != null) {
			obj.setNombres(usuario.getNombres());
			obj.setFechaNacimiento(usuario.getFechaNacimiento());
			obj.setDni(usuario.getDni());
			obj.setIdRegion(usuario.getIdRegion());
			obj.setNombreRegion(usuario.getNombreRegion());
			repository.save(obj);
		}
		
	}

	@Override
	public void eliminar(String id) {
		Optional<Usuario> obj = repository.findById(id);
		if(obj.isPresent()) {
			repository.delete(obj.get());
		}
		
	}

}
