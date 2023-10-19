package pe.pizzeria.pizzanicola.servicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.pizzeria.pizzanicola.servicio.business.ClienteService;
import pe.pizzeria.pizzanicola.servicio.modelo.Cliente;

import java.util.List;

@RestController
@RequestMapping("/pizzeria")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping("/clientes")
    public List<Cliente> listaClientes() {
        return service.listaClientes();
    }

    
}
