package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class Exerc14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 numeros.");
        int[] vetorA = new int[10];
        int soma = 0;
        int qtdImpar = 0;
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            if(vetorA[i]%2!=0) {
                soma += vetorA[i];
                qtdImpar++;
            }
        }
        double media = soma/qtdImpar;
        System.out.print("A media dos impares é "+media);
    }
}
