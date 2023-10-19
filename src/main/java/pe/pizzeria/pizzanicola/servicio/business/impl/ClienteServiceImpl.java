package pe.pizzeria.pizzanicola.servicio.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.business.ClienteService;
import pe.pizzeria.pizzanicola.servicio.modelo.Cliente;
import pe.pizzeria.pizzanicola.servicio.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> listaClientes() {
        return repository.findAll();
    }

    @Override
    public Optional<Cliente> listaClientePorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void guardar(Cliente cliente) {
        repository.save(cliente);
    }

    @Override
    public void actualizar(Integer id, Cliente cliente) {
        Cliente objeto = repository.findById(id).get();
        if (objeto != null) {
            objeto.setNombre(cliente.getNombre());
            objeto.setApellidos(cliente.getApellidos());
            objeto.setEdad(cliente.getEdad());
            objeto.setEstado(cliente.getEstado());
            repository.save(objeto);
        }
    }

    @Override
    public void eliminar(Integer id) {
        Optional<Cliente> objeto = repository.findById(id);
        if (objeto.isPresent()) {
            repository.delete(objeto.get());
        }
    }
}
