package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero inteiro.");
        int num = scan.nextInt();

        boolean primo = true;

        for(int i=2;i<num;i++){
            if (num%i==0){
                System.out.println("nao é primo.");
                primo = false;
            }
        }

        if (primo)
            System.out.println("É primo");
    }
}
