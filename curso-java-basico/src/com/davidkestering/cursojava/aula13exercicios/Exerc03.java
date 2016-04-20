package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int primeiroNum = scan.nextInt();
        int segundoNum = scan.nextInt();
        int resultado = primeiroNum+segundoNum;
        System.out.println("Resultado: "+resultado);

        /*System.out.println("Pense em um número entre 1 e 10. Digite o número que você pensou: ");
        int num = scan.nextInt();
        System.out.println("Você pensou no número: "+num);*/
    }
}
