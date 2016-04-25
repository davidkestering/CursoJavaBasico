package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 números");
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            vetorB[i] = 0;
            if(vetorA[i]%2==0)
                vetorB[i] = 1;
        }

        System.out.print("Vetor A = ");
        for(int i=0;i<vetorA.length;i++){
            if(i+1==vetorA.length)
                System.out.print(vetorA[i]+"\n");
            else
                System.out.print(vetorA[i]+", ");
        }

        System.out.print("Vetor B = ");
        for(int i=0;i<vetorB.length;i++){
            if(i+1==vetorB.length)
                System.out.print(vetorB[i]+"\n");
            else
                System.out.print(vetorB[i]+", ");
        }
    }
}
