package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius: ");
        double tempC = scan.nextDouble();
        double tempF = (tempC*1.8)+32;
        System.out.println("A temperatura convertida em Farenheit é: "+tempF);
    }
}
