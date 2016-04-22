package com.davidkestering.cursojava.aula19exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 numeros.");
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        DecimalFormat df = new DecimalFormat("###,###.##");

        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
            vetorC[i] = vetorA[i]-vetorB[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0;i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }

        System.out.print("\nVetor B = ");
        for (int i=0;i<vetorA.length;i++){
            System.out.print(df.format(vetorB[i])+" ");
        }

        System.out.print("\nVetor C = ");
        for (int i=0;i<vetorA.length;i++){
            System.out.print(df.format(vetorC[i])+" ");
        }
    }
}
