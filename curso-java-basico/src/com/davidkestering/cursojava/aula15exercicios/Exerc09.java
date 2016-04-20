package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 3 números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int tempA = 0;
        int tempB = 9999999;
        int tempC = 0;
        if(num1 >= tempA)
            tempA = num1;
        if(num2 >= tempA)
            tempA = num2;
        if(num3 >= tempA)
            tempA = num3;

        if(num1 <= tempB)
            tempB = num1;
        if(num2 <= tempB)
            tempB = num2;
        if(num3 <= tempB)
            tempB = num3;

        if(!(num1 <= tempB) && !(num1 >= tempA))
            tempC = num1;
        if(!(num2 <= tempB) && !(num2 >= tempA))
            tempC = num2;
        if(!(num3 <= tempB) && !(num3 >= tempA))
            tempC = num3;

        System.out.println("Ordenacao decrescente: " + tempA + ", "+ tempC +", "+tempB);


    }
}
