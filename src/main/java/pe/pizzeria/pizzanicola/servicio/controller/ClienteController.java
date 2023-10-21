package pe.pizzeria.pizzanicola.servicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.pizzeria.pizzanicola.servicio.model.Cliente;
import pe.pizzeria.pizzanicola.servicio.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pizzeria/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping("/")
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @PostMapping("/cliente")
    public Cliente registrar(@RequestBody Cliente cliente) {
        return repository.insert(cliente);
    }

    @PutMapping("/cliente/{id}")
    public Cliente actualizar(@PathVariable String id, @RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public void eliminarCliente(@PathVariable String id) {
        repository.deleteById(id);
    }
}
