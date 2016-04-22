package com.davidkestering.cursojava.aula19exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 15 numeros.");
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        DecimalFormat df = new DecimalFormat("###,###.##");

        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (int i=0;i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }

        System.out.print("\nVetor B = ");
        for (int i=0;i<vetorA.length;i++){
            System.out.print(df.format(vetorB[i])+" ");
        }
    }
}
