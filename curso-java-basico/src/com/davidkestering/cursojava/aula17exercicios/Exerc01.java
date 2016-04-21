package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota = -1;
        do {
            System.out.println("Informe uma nota entre 0 e 10:");
            nota = scan.nextDouble();
            if(nota<0 || nota >10)
                System.out.println("A nota é inválida.");
        }while (nota < 0 || nota > 10);

    }
}
