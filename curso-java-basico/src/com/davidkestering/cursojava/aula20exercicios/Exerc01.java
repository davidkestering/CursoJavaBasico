package com.davidkestering.cursojava.aula20exercicios;

import java.util.Random;

/**
 * Created by seduc on 25/04/2016.
 */
public class Exerc01 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int maior = Integer.MIN_VALUE;
        Random numerosRandomicos = new Random();
        String pos;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = numerosRandomicos.nextInt(100);
            }
        }
        pos = "";
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
                if(matriz[i][j]>maior) {
                    maior = matriz[i][j];
                    pos = "Linha "+(i+1)+" Coluna "+(j+1);
                }
            }
            System.out.println();
        }
        System.out.println("O maior número é "+maior+" na posição "+pos);
    }
}
