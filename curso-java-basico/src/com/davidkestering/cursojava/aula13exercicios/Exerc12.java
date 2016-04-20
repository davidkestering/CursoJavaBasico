package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7*altura)-58;
        System.out.println("Seu peso ideal é: "+pesoIdeal);
    }
}
