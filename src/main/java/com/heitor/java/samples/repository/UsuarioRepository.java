package com.heitor.java.samples.repository;

import com.heitor.java.samples.entity.Usuario;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @EntityGraph(value = "user-entity-graph", type = EntityGraph.EntityGraphType.FETCH)
    List<Usuario> findAll();
}
