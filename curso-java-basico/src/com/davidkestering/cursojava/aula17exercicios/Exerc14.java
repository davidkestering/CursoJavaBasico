package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 numeros inteiros.");
        int contPar = 0;
        int contImpar = 0;
        int num;
        for(int i=1;i<=10;i++){
            num = scan.nextInt();
            if(num%2==0)
                contPar++;
            else
                contImpar++;
        }
        System.out.println("A qtde de Pares é: "+contPar);
        System.out.println("A qtde de Impares é: "+contImpar);
    }
}
