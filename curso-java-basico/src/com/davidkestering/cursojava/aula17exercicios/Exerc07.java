package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int maior = Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            System.out.println("Informe um número:");
            num = scan.nextInt();
            if(num>maior)
                maior = num;
        }
        System.out.println("O maior número é: "+maior);
    }
}
