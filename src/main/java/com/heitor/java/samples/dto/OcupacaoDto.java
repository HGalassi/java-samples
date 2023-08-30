package com.heitor.java.samples.dto;
public class OcupacaoDto {

    private Long idOcupacao;

    private String nome;

    private SetorDto setor;

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

    public SetorDto getSetor() {
        return setor;
    }

    public void setSetor(SetorDto setor) {
        this.setor = setor;
    }
}
