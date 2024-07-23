package com.juliorazo.tiendas_patito.services;

import com.juliorazo.tiendas_patito.entities.Pedido;

import java.util.List;

public interface IPedidoService {

    public Pedido crearPedido(Pedido pedido);
    public List<Pedido> obtenerPedidosPorCliente(String cliente);
    public void actualizarEstadoPedidos();
    public void cancelarPedido(Long id);
}
