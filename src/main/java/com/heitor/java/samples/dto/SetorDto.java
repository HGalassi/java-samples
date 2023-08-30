package com.heitor.java.samples.dto;

import com.heitor.java.samples.entity.Usuario;

public class SetorDto {

    private Long idSetor;

    private int andarSetor;

    private UsuarioDto usuario;
    private int numeroSala;

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

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
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
