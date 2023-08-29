package com.heitor.java.samples.access_modifiers_samples;

public class Country {

    public String nome;

    private String estado;

    protected int total_estados;

    private final static String capital = "São Paulo";

    private final String presidente = "";

    private static String tipoGoverno = "";



    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPresidente() {
        return presidente;
    }

    public static String getTipoGoverno() {
        return tipoGoverno;
    }

    public static void setTipoGoverno(String tipoGoverno) {
        Country.tipoGoverno = tipoGoverno;
    }
}
