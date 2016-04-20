package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado,2);
        System.out.println("O valor dobrado da área é: "+(area*2));
    }
}
