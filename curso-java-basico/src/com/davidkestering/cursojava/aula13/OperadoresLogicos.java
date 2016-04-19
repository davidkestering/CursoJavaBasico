package com.davidkestering.cursojava.aula13;

/**
 * Created by davidkestering on 17/04/16.
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 AND valor2 é 2 = "+resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 = "+resultado2);

        boolean v = true;
        boolean f = false;
        System.out.println(v&&f);
        System.out.println(v||f);
        System.out.println(v^f);
        System.out.println(!v&&f);
    }
}
