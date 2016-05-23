package com.davidkestering.cursojava.aula54;

/**
 * Created by seduc on 23/05/2016.
 */
public enum DiaSemana {
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    DiaSemana(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
