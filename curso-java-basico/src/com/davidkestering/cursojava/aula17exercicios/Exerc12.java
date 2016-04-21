package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o numero da tabuada que deseja (1a10).");
        int num1 = scan.nextInt();
        System.out.println("Tabuada de "+num1);
        for(int i=1;i<=10;i++){
            System.out.println(num1+"x"+i+"="+(num1*i));
        }
    }
}
