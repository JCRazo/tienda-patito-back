package com.juliorazo.tiendas_patito.repositories;

import com.juliorazo.tiendas_patito.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    @Query("SELECT p FROM Pedido p WHERE p.cliente = :cliente")
    List<Pedido> findByCliente(@Param("cliente") String cliente);

    @Query(value = "SELECT * FROM Pedido WHERE status = :status AND fecha_pedido < :fechaPedido", nativeQuery = true)
    List<Pedido> findByStatusAndFechaPedidoBefore(@Param("status") String status, @Param("fechaPedido") LocalDateTime fechaPedido);
}
