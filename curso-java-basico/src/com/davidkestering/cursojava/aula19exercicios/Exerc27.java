package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 números");
        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            if(vetorA[i]<7)
                vetorB[i] = 'a';
            else if(vetorA[i]==7)
                vetorB[i] = 'b';
            else if(vetorA[i]>7 && vetorA[i]<10)
                vetorB[i] = 'c';
            else if(vetorA[i]==10)
                vetorB[i] = 'd';
            else
                vetorB[i] = 'e';
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
