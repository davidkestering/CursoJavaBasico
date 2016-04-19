package com.davidkestering.cursojava.aula13;

/**
 * Created by davidkestering on 17/04/16.
 */
public class CurtoCircuito {
    public static void main(String[] args) {
        boolean v = true;
        boolean f = false;
        boolean resultado1 = f&v;
        boolean resultado2 = f&&v;
        System.out.println(resultado1);
        System.out.println(resultado2);

        int resultado = 1+2-3+4*5/5;
        System.out.println(resultado);

    }
}
