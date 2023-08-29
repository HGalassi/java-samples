package com.heitor.java.samples.calc_salario;

import org.springframework.stereotype.Component;

@Component
public class Calcula {

    public Calcula(){
        System.out.println(this.calculaAdicionalNoturno());
        System.out.println(this.calculaHoraExtraDiurna());
        System.out.println(this.calculaHoraExtralNoturno());
        System.out.println(this.calculaHoraExtraDomFer());
    }

    private double calculaHoraExtraDomFer(){
        BaseCalc base = new BaseCalc();
        BaseCalcAdicional adicional = new BaseCalcAdicional();

        return (base.getSalarioHora() * adicional.getHoraExtraFeriado()) * base.getQtdHorasExtrasDomFer();
    }

    private double calculaHoraExtralNoturno(){
        BaseCalc base = new BaseCalc();
        BaseCalcAdicional adicional = new BaseCalcAdicional();
        return (base.getSalarioHora() * adicional.getHoraExtraNoturna()) * base.getQtdHoraExtraNoturna();
    }

    private double calculaAdicionalNoturno(){
        BaseCalc base = new BaseCalc();
        BaseCalcAdicional adicional = new BaseCalcAdicional();
        return (base.getSalarioHora() * adicional.getHoraAdicionalNoturno()) * base.getHorasTrabalhadasNoturnas();
    }

    private double calculaHoraExtraDiurna () {
        BaseCalc base = new BaseCalc();
        BaseCalcAdicional adicional = new BaseCalcAdicional();
        return base.getSalarioHora() * adicional.getHoraExtraDiurna() * base.getQtdHorasExtras();
    }

    private double calculaReflexoHoraExtraDSR(){
        return 0.0;
    }

    private double calculaReflexoAdicionalNoturnoDSR(){
        return 0.0;
    }

}
