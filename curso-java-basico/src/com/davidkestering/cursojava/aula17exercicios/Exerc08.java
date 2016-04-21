package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        for(int i=0;i<5;i++){
            System.out.println("Informe o número.");
            num += scan.nextInt();
        }
        double media = num/5;
        System.out.println("A soma dos números é: "+num+"\n"+
                            "A média dos números é: "+media);
    }
}
