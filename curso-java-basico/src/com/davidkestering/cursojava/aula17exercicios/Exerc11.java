package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dois números inteiros.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = 0;
        for(int i=num1;i<=num2;i++){
            System.out.println(i);
            soma += i;
        }
        System.out.println("A soma é : "+soma);
    }
}
