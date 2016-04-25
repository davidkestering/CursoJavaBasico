package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc20e21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor de cotação do Dólar em relação ao Real");
        double valorDolar = scan.nextDouble();
        double[] vetorA = new double[20];
        String saida = "";
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = valorDolar*i;
            saida += "Dolar na posicao "+i+" = "+vetorA[i]+"\n";
        }
        System.out.print(saida);

    }
}
