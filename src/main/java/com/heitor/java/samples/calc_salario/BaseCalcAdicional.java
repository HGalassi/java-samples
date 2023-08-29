package com.heitor.java.samples.calc_salario;

public class BaseCalcAdicional {

    private final double horaExtraDiurna = 1.5;

    private final double horaExtraNoturna = 1.8;


    private final double horaExtraDomFeriado = 2.0;

    private final double horaAdicionalNoturno = 0.2;


    public double getHoraAdicionalNoturno() {
        return horaAdicionalNoturno;
    }

    public double getHoraExtraDiurna() {
        return horaExtraDiurna;
    }

    public double getHoraExtraNoturna() {
        return horaExtraNoturna;
    }

    public double getHoraExtraFeriado() {
        return horaExtraDomFeriado;
    }

    public double getHoraExtraFinalSemana() {
        return horaExtraDomFeriado;
    }
}
