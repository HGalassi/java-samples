package com.heitor.java.samples.access_modifiers_samples;

public class CountryValidador extends Country{

    public CountryValidador(){
        Country c = new Country();
        c.nome = "Brasil";
        c.total_estados = 26;
        c.setEstado("São Paulo");
    }
}
