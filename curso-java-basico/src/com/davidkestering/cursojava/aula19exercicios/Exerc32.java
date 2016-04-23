package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 5 números");
        int[] vetorA = new int[5];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
        }

        for(int i=0;i<vetorA.length;i++){
            System.out.println("Tabuada do valor "+vetorA[i]);
            for(int j=1;j<=10;j++){
                System.out.println(vetorA[i]+"x"+j+"="+(vetorA[i]*j));
            }
        }
    }
}
