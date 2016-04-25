package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero inteiro.");
        int num = scan.nextInt();
        boolean primo;
        for(int i=1;i<=num;i++){
            primo = true;
            for(int j=2;j<i;j++){
                if (i%j==0){
                    primo = false;
                }
            }
            if (primo)
                System.out.println(i);
        }
    }
}
