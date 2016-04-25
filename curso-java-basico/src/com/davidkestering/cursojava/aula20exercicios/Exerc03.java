package com.davidkestering.cursojava.aula20exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 25/04/2016.
 */
public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaPar = 0;
        int somaImpar = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("Informe o valor da linha "+(i+1)+" na coluna "+(j+1));
                matriz[i][j] = scan.nextInt();
                if(matriz[i][j]%2==0)
                    somaPar++;
                else
                    somaImpar++;
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("A quantidade de pares é: "+somaPar);
        System.out.println("A quantidade de impares é: "+somaImpar);
    }
}
