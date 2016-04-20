package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor que você ganha por hora e quantas horas você trabalha no mês: ");
        double valorHora = scan.nextDouble();
        int qtdHora = scan.nextInt();
        double resultado = valorHora*qtdHora;
        System.out.println("Você ganha "+resultado+" reais por mês.");
    }
}
