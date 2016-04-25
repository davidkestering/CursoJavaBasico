package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc22 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int qtdZero = 0;
        int qtdUm = 0;
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = (int) Math.round(Math.random()*1);
            if(vetorA[i]==1)
                qtdUm++;
            else
                qtdZero++;
        }
        System.out.print("Vetor A = ");
        for(int i=0;i<vetorA.length;i++){
            if(i+1==vetorA.length)
                System.out.print(vetorA[i]+"\n");
            else
                System.out.print(vetorA[i]+", ");
        }
        double porcZero = (100*qtdZero)/vetorA.length;
        double porcUm = (100*qtdUm)/vetorA.length;
        System.out.print("A porcentagem de zeros é de "+porcZero+"%, de Ums de "+porcUm+"%.");
    }
}
