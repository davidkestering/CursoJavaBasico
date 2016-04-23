package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 números");
        int[] vetorA = new int[10];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
        }

        for(int i=0;i<vetorA.length;i++){
            if(vetorA[i]%2==0)
                System.out.println("O valor na posicao "+i+" é par.");
            else{
                System.out.println("O valor na posicao "+i+" não é par.");
                break;
            }

        }
    }
}
