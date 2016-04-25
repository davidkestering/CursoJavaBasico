package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class Exerc18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 numeros.");
        int[] vetorA = new int[10];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int posiMenor = 0;
        int posiMaior = 0;
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            if(vetorA[i]<menor) {
                menor = vetorA[i];
                posiMenor = i;
            }
            if(vetorA[i]>maior){
                maior = vetorA[i];
                posiMaior = i;
            }
        }
        System.out.println("A menor idade é "+menor+", na posicao "+posiMenor);
        System.out.println("A maior idade é "+maior+", na posicao "+posiMaior);
    }
}
