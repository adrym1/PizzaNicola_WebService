package pe.pizzeria.pizzanicola.servicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.pizzeria.pizzanicola.servicio.business.ClienteService;
import pe.pizzeria.pizzanicola.servicio.modelo.Cliente;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pizzeria")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping("/clientes")
    public List<Cliente> listaClientes() {
        return service.listaClientes();
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> listaClientePorId(@PathVariable Integer id) {
        return service.listaClientePorId(id);
    }

    @PostMapping("/clientes")
    public void guardarCliente(@RequestBody Cliente cliente) {
        service.guardar(cliente);
    }

    @PutMapping("/clientes/{id}")
    public void actualizarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        service.actualizar(id, cliente);
    }

    @DeleteMapping("/clientes/{id}")
    public void eliminarCliente(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
