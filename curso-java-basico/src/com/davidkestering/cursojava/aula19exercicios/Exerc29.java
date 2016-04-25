package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 números");
        int[] vetorA = new int[10];
        int[] vetorC = new int[vetorA.length*2];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];
        }

        System.out.println("Informe 10 números");
        int[] vetorB = new int[vetorA.length];
        for(int i=0;i<vetorB.length;i++){
            vetorB[i] = scan.nextInt();
            vetorC[vetorA.length+i] = vetorB[i];
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

        System.out.print("Vetor C = ");
        for(int i=0;i<vetorC.length;i++){
            if(i+1==vetorC.length)
                System.out.print(vetorC[i]+"\n");
            else
                System.out.print(vetorC[i]+", ");
        }
    }
}
