package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 2 números");
        int primeiroNum = scan.nextInt();
        int segundoNum = scan.nextInt();
        if(primeiroNum == segundoNum)
            System.out.println("Os números são iguais: "+primeiroNum);
        else if(primeiroNum>segundoNum)
            System.out.println("O maior número é: "+primeiroNum);
        else
            System.out.println("O maior número é: "+segundoNum);
    }
}
