package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class Exerc16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 numeros.");
        int[] vetorA = new int[10];
        int soma = 0;
        int qtd = 0;
        double media = 0;
        int somaSup = 0;
        int cont=0;
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            if(vetorA[i]<15)
                soma += vetorA[i];
            else if(vetorA[i]==15)
                qtd++;
            else {
                somaSup += vetorA[i];
                cont++;
            }
        }
        media = somaSup/cont;
        System.out.println("A soma dos menores que 15 é: "+soma);
        System.out.println("A qtde dos iguais que 15 é: "+qtd);
        System.out.println("A media dos superiores que 15 é: "+media);
    }
}
