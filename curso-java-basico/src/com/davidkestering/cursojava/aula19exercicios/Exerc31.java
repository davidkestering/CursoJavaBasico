package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 20 números");
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int contPar=0;
        int contImpar=0;
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
        }

        int j=0;
        for(int i=0;i<vetorA.length;i++){
            if(vetorA[i]%2==0) {
                vetorB[j] = vetorA[i];
                j++;
            }
        }

        for(int i=0;i<vetorA.length;i++){
            if(vetorA[i]%2!=0) {
                vetorB[j] = vetorA[i];
                j++;
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
