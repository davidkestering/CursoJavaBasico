package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano:");
        int ano = scan.nextInt();

        if((ano%4 == 0 && ano%100 != 0) || ano%400==0)
            System.out.println("O ano é bisexto.");
        else
            System.out.println("O ano não é bisexto.");
    }
}
