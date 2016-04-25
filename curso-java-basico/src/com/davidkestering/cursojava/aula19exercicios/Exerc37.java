package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 15 números");
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for(int i=0;i<vetorA.length;i++){
            vetorB[i] = 1;
            vetorA[i] = scan.nextInt();
            for(int j=vetorA[i];j>=1;j--){
                vetorB[i] *= j;
            }
        }

        System.out.print("Vetor A tem "+vetorA.length+" posições: ");
        for(int i=0;i<vetorA.length;i++){
            if(i+1==vetorA.length)
                System.out.print(vetorA[i]+"\n");
            else
                System.out.print(vetorA[i]+", ");
        }

        System.out.print("Vetor B tem "+vetorB.length+" posições: ");
        for(int i=0;i<vetorB.length;i++){
            if(i+1==vetorB.length)
                System.out.print(vetorB[i]+"\n");
            else
                System.out.print(vetorB[i]+", ");
        }
    }
}
