package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        int n = scan.nextInt();
        double valor = 1;
        System.out.print("H = 1 + ");
        for(int i=1;i<=n;i++){
            System.out.print("1/"+i);
            valor += (1/i);
            if(i<n)
                System.out.print(" + ");
            else
                System.out.print("");
        }
        System.out.print(" = "+valor);
    }
}
