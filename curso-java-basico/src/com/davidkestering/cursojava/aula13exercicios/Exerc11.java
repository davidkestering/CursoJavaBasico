package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 2 números inteiros e 1 número real: ");
        int primeiroNum = scan.nextInt();
        int segundoNum = scan.nextInt();
        double terceiroNum = scan.nextDouble();
        double resultadoA = (primeiroNum*2)*(segundoNum/2);
        double resultadoB = (primeiroNum*3)+terceiroNum;
        double resultadoC = Math.pow(terceiroNum,3);
        System.out.println("A = "+resultadoA);
        System.out.println("B = "+resultadoB);
        System.out.println("C = "+resultadoC);
    }
}
