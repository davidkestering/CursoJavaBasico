package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o raio do círculo: ");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio,2);
        System.out.println("O valor da área é: "+area);
    }
}
