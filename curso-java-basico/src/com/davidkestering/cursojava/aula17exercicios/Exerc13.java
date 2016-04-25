package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe os valores base e expoente.");
        int base = scan.nextInt();
        int potencia = scan.nextInt();
        int valor = 1;
        for(int i=1;i<=potencia;i++){
            valor *= base;
        }
        System.out.println("O valor é "+valor);
        System.out.println("Prova: "+Math.pow(base,potencia));
    }
}
