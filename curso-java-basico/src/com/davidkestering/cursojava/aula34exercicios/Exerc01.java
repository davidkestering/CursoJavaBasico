package com.davidkestering.cursojava.aula34exercicios;

/**
 * Created by seduc on 10/05/2016.
 */
public class Exerc01 {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }

    public static void main(String[] args) {

        //Contador.zerar();
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        imprimirValor();
    }
}
