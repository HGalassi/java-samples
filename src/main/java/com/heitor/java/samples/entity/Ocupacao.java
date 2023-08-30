package com.heitor.java.samples.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@NamedEntityGraph(name = "ocupacao-entity-graph",
attributeNodes = {
        @NamedAttributeNode("setor")
}, subgraphs = {@NamedSubgraph(name = "setor-entity-graph", attributeNodes = {@NamedAttributeNode("usuario")})
})
@Entity(name = "ocupacao")
public class Ocupacao {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id()
    @Column(name = "id_ocupacao")
    private Long idOcupacao;

    @Column(name = "nome", length = 256)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="setor_id", referencedColumnName="id_setor")})
    private Setor setor;

    public Long getIdOcupacao() {
        return idOcupacao;
    }

    public void setIdOcupacao(Long idOcupacao) {
        this.idOcupacao = idOcupacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
