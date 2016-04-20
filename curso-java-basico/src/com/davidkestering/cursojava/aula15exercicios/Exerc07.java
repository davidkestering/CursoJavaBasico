package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 3 números");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3)
            System.out.println("O num1 é maior");
        else if(num2 > num1 && num2 > num3)
            System.out.println("O num2 é maior");
        else
            System.out.println("O num3 é maior");

        if(num1 < num2 && num1 < num3)
            System.out.println("O num1 é menor");
        else if(num2 < num1 && num2 < num3)
            System.out.println("O num2 é menor");
        else
            System.out.println("O num3 é menor");
    }
}
