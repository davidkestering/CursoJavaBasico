package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe qtas notas deseja digitar.");
        int qtdNotas = scan.nextInt();
        int soma = 0;
        double nota = 0;
        double media = 0;
        for(int i=1;i<=qtdNotas;i++){
            System.out.println("Informe a nota.");
            nota = scan.nextDouble();
            soma+=nota;
        }
        media = soma/qtdNotas;
        System.out.println("A media aritmetica é: "+media);
    }
}
