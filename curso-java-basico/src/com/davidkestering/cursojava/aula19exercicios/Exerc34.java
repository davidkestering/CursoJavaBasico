package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 números");
        int[] vetorA = new int[10];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
        }

        System.out.print("Vetor A tem "+vetorA.length+" posições: ");
        for(int i=0;i<vetorA.length;i++){
            if(i+1==vetorA.length)
                System.out.print(vetorA[i]+"\n");
            else
                System.out.print(vetorA[i]+", ");
        }

        for(int i=0;i<vetorA.length;i++){
            if(vetorA[i]%2==0){
                System.out.print("Pares até: "+vetorA[i]+" -> ");
                for(int j=1;j<=vetorA[i];j++){
                    if(j%2==0)
                        System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
