package com.davidkestering.cursojava.aula52;

/**
 * Created by davidkestering on 20/05/16.
 */
public class DivisaoNaoExata extends Exception {
    private int num;
    private int denominador;

    public DivisaoNaoExata(int num, int denominador) {
        super();
        this.num = num;
        this.denominador = denominador;
    }


    @Override
    public String toString() {
        return "Resultado de "+num+"/"+denominador+" não é um inteiro.";
    }
}
