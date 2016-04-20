package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de metros: ");
        double qtdMetros = scan.nextDouble();
        double resultado = qtdMetros*100;
        System.out.println("A quantidade de centimetros é: "+resultado);
    }
}
