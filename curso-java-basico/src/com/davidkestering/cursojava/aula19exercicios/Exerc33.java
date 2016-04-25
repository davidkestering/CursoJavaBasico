package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 números");
        int[] vetorA = new int[10];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
        }

        int cont=0;

        for(int i=0;i<vetorA.length;i++){
            System.out.print("O valor "+vetorA[i]);
            for(int j=1;j<=vetorA[i];j++){
                if(vetorA[i]%j==0)
                    cont++;
            }
            if(cont==2)
                System.out.print(" é primo.\n");
            else
                System.out.print(" não é primo.\n");
            cont=0;
        }
    }
}
