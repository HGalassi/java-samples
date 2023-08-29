package com.heitor.java.samples.entity;

import jakarta.persistence.*;

@Entity(name = "setor")
public class Setor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id()
    private Long idSetor;

    @Column(name = "andar_setor")
    private int andarSetor;

    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "numero_sala")
    private int numeroSala;

    @Column(name= "departamento", length = 256)
    private String departamento;
}
