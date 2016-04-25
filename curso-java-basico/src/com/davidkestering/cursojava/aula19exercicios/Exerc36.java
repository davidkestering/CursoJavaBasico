package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc36 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[11];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = (int) Math.pow(2,i);
        }

        System.out.print("Vetor A tem "+vetorA.length+" posições: ");
        for(int i=0;i<vetorA.length;i++){
            if(i+1==vetorA.length)
                System.out.print(vetorA[i]+"\n");
            else
                System.out.print(vetorA[i]+", ");
        }
    }
}
