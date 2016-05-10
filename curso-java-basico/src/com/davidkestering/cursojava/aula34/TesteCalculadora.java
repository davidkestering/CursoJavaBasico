package com.davidkestering.cursojava.aula34;

/**
 * Created by seduc on 10/05/2016.
 */
public class TesteCalculadora {
    public static void main(String[] args) {
        //MinhaCalculadora calc = new MinhaCalculadora();
        int soma1 = MinhaCalculadora.soma(1,2);
        System.out.println(soma1);
        double soma2 = MinhaCalculadora.soma(1.0,2.0);
        System.out.println(soma2);
    }
}
