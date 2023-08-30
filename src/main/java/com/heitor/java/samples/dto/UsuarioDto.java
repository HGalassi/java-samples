package com.heitor.java.samples.dto;

import java.sql.Date;

public class UsuarioDto {
    private Long idUsuario;

    private String nomeUsuario;

    private Date dataCriacao;

    private OcupacaoDto ocupacao;

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

    public OcupacaoDto getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(OcupacaoDto ocupacao) {
        this.ocupacao = ocupacao;
    }
}
