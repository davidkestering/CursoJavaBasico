package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Infome um número inteiro.");
        int num = scan.nextInt();
        if(num%2==0)
            System.out.println("O Número é par.");
        else
            System.out.println("O número é impar.");
    }
}
