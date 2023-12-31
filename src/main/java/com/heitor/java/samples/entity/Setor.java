package com.heitor.java.samples.entity;

import jakarta.persistence.*;

@NamedEntityGraph(name = "setor-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("usuario")
        })
@Entity(name = "setor")
public class Setor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id()
    @Column(name = "id_setor")
    private Long idSetor;

    @Column(name = "andar_setor")
    private int andarSetor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="usuario_id", referencedColumnName="id_usuario")})
    private Usuario usuario;

    @Column(name = "numero_sala")
    private int numeroSala;

    @Column(name= "departamento", length = 256)
    private String departamento;

    public Long getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Long idSetor) {
        this.idSetor = idSetor;
    }

    public int getAndarSetor() {
        return andarSetor;
    }

    public void setAndarSetor(int andarSetor) {
        this.andarSetor = andarSetor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
