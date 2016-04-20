package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe os valores dos 3 lados do triângulo:");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if(lado1 == 0 || lado2 == 0 || lado3 == 0)
            System.out.println("A soma de quaisquer dois lados não formam um triângulo!");
        else if((lado1+lado2)>lado3 || (lado1+lado3)>lado2 || (lado2+lado3)>lado1){
            if (lado1 == lado2 && lado1 == lado3)
                System.out.println("O triângulo é Equilátero.");
            else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2))
                System.out.println("O triângulo é Isosceles.");
            else
                System.out.println("O triângulo é Escaleno");
        } else
            System.out.println("A soma de quaisquer dois lados não formam um triângulo!");

    }
}
