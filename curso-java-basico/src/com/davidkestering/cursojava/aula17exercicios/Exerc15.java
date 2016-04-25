package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe quantos termos vc quer ver.");
        int qtd = scan.nextInt();
        int fib = 1;
        int numAnt = 0;
        int numAtual = fib;
        int cont = 1;
        System.out.print(fib+" ");
        while (cont<qtd){
            numAtual = numAnt + fib;
            numAnt = fib;
            fib = numAtual;
            System.out.print(fib+" ");
            cont++;
        }
    }
}
