package com.juliorazo.tiendas_patito.repositories;

import com.juliorazo.tiendas_patito.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {}
