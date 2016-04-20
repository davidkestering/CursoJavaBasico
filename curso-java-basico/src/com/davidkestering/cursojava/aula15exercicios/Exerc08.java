package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor de 3 produtos");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if(num1 < num2 && num1 < num3)
            System.out.println("Compre o primeiro produto");
        else if(num2 < num1 && num2 < num3)
            System.out.println("Compre o segundo produto");
        else
            System.out.println("Compre o terceiro produto");
    }
}
