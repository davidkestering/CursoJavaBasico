package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a qtde de CDs");
        int qtdCd = scan.nextInt();
        double somaValor = 0;
        int i=1;
        do{
            System.out.println("Informe o valor.");
            somaValor += scan.nextDouble();
            i++;
        }while (i<=qtdCd);
        double media = somaValor/qtdCd;
        System.out.println("O valor investido foi: "+somaValor+"\nA media por cd é de "+media);
    }
}
