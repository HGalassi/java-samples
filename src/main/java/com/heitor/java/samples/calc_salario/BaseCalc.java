package com.heitor.java.samples.calc_salario;

public class BaseCalc {

    private int horasMensais = 220;

    private float salarioBase = 1400.00F;

    public int getHorasMensais() {
        return horasMensais;
    }

    public void setHorasMensais(int horasMensais) {
        this.horasMensais = horasMensais;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public float getHorasTrabalhadasNoturnas() {
        return horasTrabalhadasNoturnas;
    }

    public void setHorasTrabalhadasNoturnas(float horasTrabalhadasNoturnas) {
        this.horasTrabalhadasNoturnas = horasTrabalhadasNoturnas;
    }

    public float getQtdHorasExtras() {
        return qtdHorasExtras;
    }

    public void setQtdHorasExtras(float qtdHorasExtras) {
        this.qtdHorasExtras = qtdHorasExtras;
    }

    public float getQtdHoraExtraNoturna() {
        return qtdHoraExtraNoturna;
    }

    public void setQtdHoraExtraNoturna(float qtdHoraExtraNoturna) {
        this.qtdHoraExtraNoturna = qtdHoraExtraNoturna;
    }

    public float getHoraExtraDomFer() {
        return horaExtraDomFer;
    }

    public void setHoraExtraDomFer(float horaExtraDomFer) {
        this.horaExtraDomFer = horaExtraDomFer;
    }

    private float salarioHora = 6.36F;

    private float horasTrabalhadasNoturnas = 105.00F;

    private float qtdHorasExtras = 36.00F;

    private float qtdHorasExtrasDomFer = 16.00F;

    private float qtdHoraExtraNoturna = 2.30F;

    private float horaExtraDomFer = 16.00F;

    public float getQtdHorasExtrasDomFer() {
        return qtdHorasExtrasDomFer;
    }
}
