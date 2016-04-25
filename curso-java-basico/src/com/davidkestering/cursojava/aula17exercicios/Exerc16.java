package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc16 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int fib = 1;
        int numAnt = 0;
        int numAtual = fib;
        boolean valid = false;
        int cont = 0;

        while (!valid){
            System.out.print(fib+" ");
            numAtual = numAnt + fib;
            numAnt = fib;
            fib = numAtual;
            if (fib>= 500){
                cont++;
                if(cont>1)
                    valid = true;
            }
        }


    }
}
