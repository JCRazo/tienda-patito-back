package com.juliorazo.tiendas_patito.services.impl;

import com.juliorazo.tiendas_patito.services.IPedidoService;
import com.juliorazo.tiendas_patito.services.ITareaProgramada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TareaProgramadaImpl implements ITareaProgramada {

    @Autowired
    private IPedidoService iPedidoService;

    @Scheduled(fixedRate = 60000)
    @Override
    public void actualizarEstados() {
        iPedidoService.actualizarEstadoPedidos();
    }
}
