package com.heitor.java.samples.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity(name = "ocupacao")
public class Ocupacao {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id()
    @Column(name = "id_ocupacao")
    private Long idOcupacao;

    @Column(name = "nome", length = 256)
    private String nome;

    @Column(name="setor_id")
    private Long setorId;
}
