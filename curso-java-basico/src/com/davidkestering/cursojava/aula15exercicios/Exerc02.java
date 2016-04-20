package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 1 número");
        int num = scan.nextInt();
        if(num < 0)
            System.out.println("O número é negativo: "+num);
        else
            System.out.println("O número é positivo: "+num);
    }
}
