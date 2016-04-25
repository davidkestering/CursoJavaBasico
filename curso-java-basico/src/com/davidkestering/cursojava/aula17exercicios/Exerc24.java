package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o preço do pao.");
        double preco = scan.nextDouble();
        System.out.println("Tabela de preços.");
        for(int i=1;i<=50;i++){
            System.out.println(i+" - "+(i*preco));
        }
    }
}
