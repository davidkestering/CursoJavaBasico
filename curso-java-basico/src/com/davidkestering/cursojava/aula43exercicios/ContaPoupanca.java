package com.davidkestering.cursojava.aula43exercicios;


import java.util.Calendar;

/**
 * Created by davidkestering on 14/05/16.
 */
public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();
        if(this.getDiaRendimento() == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo((this.getSaldo()*taxaRendimento)+this.getSaldo());
        }
        return this.getSaldo();
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaRendimento=" + getDiaRendimento() +
                '}';
    }

}
