package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 4 números");
        int[] vetorA = new int[4];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
        }

        int cont=0;
        for(int i=0;i<vetorA.length;i++){
            if(vetorA[i] == vetorA[(vetorA.length-1)-i]){
                cont++;
            }
        }

        if(cont==vetorA.length)
            System.out.println("Palindromo");
        else
            System.out.println("Nao eh Palindromo");
    }
}
