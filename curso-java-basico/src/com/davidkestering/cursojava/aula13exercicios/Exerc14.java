package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo: ");
        double tamanhoArquivo = scan.nextDouble();
        System.out.println("Informe a sua velocidade de internet: ");
        double velocidade = scan.nextDouble();
        double tempo = tamanhoArquivo/velocidade;
        System.out.println("Tempo de download é "+tempo);
    }
}
