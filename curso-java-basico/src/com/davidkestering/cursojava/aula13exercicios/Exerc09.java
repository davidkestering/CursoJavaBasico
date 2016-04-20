package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Farenheit: ");
        double tempF = scan.nextDouble();
        double tempC = (5*(tempF-32)/9);
        System.out.println("A temperatura convertida em Celsius é: "+tempC);
    }
}
