package com.davidkestering.cursojava.aula34exercicios;

/**
 * Created by seduc on 10/05/2016.
 */
public class Contador {
    private static int cont;

    public Contador() {
        cont++;
    }

    public static void incrementar(){
        cont++;
    }

    public static void zerar(){
        cont = 0;
    }

    public static int obterValor(){
        return cont;
    }
}
