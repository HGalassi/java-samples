package com.heitor.java.samples.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
@NamedEntityGraph(
        name = "user-entity-graph",
        attributeNodes = {
                @NamedAttributeNode(value = "nomeUsuario"),
                @NamedAttributeNode(value = "ocupacao")})
@Entity(name = "usuario" )
public class Usuario implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idUsuario;

    @Column(name = "nome_usuario", length = 256)
    private String nomeUsuario;

    @Column(name = "data_criacao", updatable = false, insertable = false)
    private Date dataCriacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="ocupacao_id", referencedColumnName="id_ocupacao"),
    })    private Ocupacao ocupacao;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Ocupacao getOcupacaoId() {
        return ocupacao;
    }

    public void setOcupacaoId(Ocupacao ocupacaoId) {
        this.ocupacao = ocupacaoId;
    }
}
