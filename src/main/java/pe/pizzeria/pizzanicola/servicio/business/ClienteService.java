package pe.pizzeria.pizzanicola.servicio.business;

import org.springframework.stereotype.Service;
import pe.pizzeria.pizzanicola.servicio.modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    public List<Cliente> listaClientes();
    public Optional<Cliente> listaClientePorId(Integer id);
    public void guardar(Cliente cliente);
    public void actualizar(Integer id, Cliente cliente);
    public void eliminar(Integer id);
}
