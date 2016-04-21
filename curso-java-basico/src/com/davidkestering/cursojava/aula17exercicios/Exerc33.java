package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        int n = scan.nextInt();
        int m;
        double valor = 0;
        for(int i=1;i<=n;i++){
            m = i + (i-1);
            System.out.print(i+"/"+m);
            valor += (i/m);
            if(i<n)
                System.out.print(" + ");
            else
                System.out.print("");
        }
        System.out.print(" = "+valor);
    }
}
