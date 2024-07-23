package com.juliorazo.tiendas_patito.services.impl;

import com.juliorazo.tiendas_patito.entities.Pedido;
import com.juliorazo.tiendas_patito.repositories.PedidoRepository;
import com.juliorazo.tiendas_patito.services.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoServiceImpl implements IPedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido crearPedido(Pedido pedido) {
        pedido.setStatus("pendiente");
        pedido.setFechaPedido(LocalDateTime.now());
        return pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> obtenerPedidosPorCliente(String cliente) {
        return pedidoRepository.findByCliente(cliente);
    }

    @Override
    public void actualizarEstadoPedidos() {
        LocalDateTime diezMinutosAtras = LocalDateTime.now().minusMinutes(10);
        List<Pedido> pedidos = pedidoRepository.findByStatusAndFechaPedidoBefore("pendiente", diezMinutosAtras);
        for (Pedido pedido : pedidos) {
            pedido.setStatus("entregado");
            pedidoRepository.save(pedido);
        }
    }

    @Override
    public void cancelarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
