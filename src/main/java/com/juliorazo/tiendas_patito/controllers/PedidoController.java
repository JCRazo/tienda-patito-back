package com.juliorazo.tiendas_patito.controllers;

import com.juliorazo.tiendas_patito.entities.Pedido;
import com.juliorazo.tiendas_patito.services.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private IPedidoService iPedidoService;

    @PostMapping("/crear")
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return iPedidoService.crearPedido(pedido);
    }

    @GetMapping("/cliente/{cliente}")
    public List<Pedido> obtenerPedidosPorCliente(@PathVariable String cliente) {
        return iPedidoService.obtenerPedidosPorCliente(cliente);
    }

    @DeleteMapping("/cancelar/{id}")
    public void cancelarPedido(@PathVariable Long id) {
        iPedidoService.cancelarPedido(id);
    }
}
