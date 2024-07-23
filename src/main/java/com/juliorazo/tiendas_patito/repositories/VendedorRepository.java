package com.juliorazo.tiendas_patito.repositories;

import com.juliorazo.tiendas_patito.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {}
