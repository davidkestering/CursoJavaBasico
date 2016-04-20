package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as 4 notas do aluno: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        double resultado = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média das notas é "+resultado);
    }
}
