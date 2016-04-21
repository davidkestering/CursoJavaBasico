package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc23 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        System.out.println("Tabela de preços.");
        double preco = 1.99;
        for(int i=1;i<=50;i++){
            System.out.println(i+" - "+(i*preco));
        }
    }
}
