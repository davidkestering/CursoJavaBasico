package com.davidkestering.cursojava.aula20exercicios;

/**
 * Created by seduc on 25/04/2016.
 */
public class Exerc02 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int[] maior = {Integer.MIN_VALUE,Integer.MIN_VALUE};
        int[] menor = {Integer.MAX_VALUE,Integer.MAX_VALUE};

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = (int) Math.round(Math.random()*10);
                if(i==4 && matriz[i][j]>maior[0])
                    maior[0] = matriz[i][j];
                if(i==4 && matriz[i][j]<menor[0])
                    menor[0] = matriz[i][j];
                if(j==6 && matriz[i][j]>maior[1])
                    maior[1] = matriz[i][j];
                if(j==6 && matriz[i][j]<menor[1])
                    menor[1] = matriz[i][j];
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Na linha 5 o maior número é "+maior[0]+" e o menor número é "+menor[0]);
        System.out.println("Na coluna 7 o maior número é "+maior[1]+" e o menor número é "+menor[1]);
    }
}
