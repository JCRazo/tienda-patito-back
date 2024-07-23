package com.juliorazo.tiendas_patito.repositories;

import com.juliorazo.tiendas_patito.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
