package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número que desejas o fatorial");
        int num = scan.nextInt();
        int total = 1;
        for(;num>=1;num--){
            total*=num;
            System.out.println("Num: "+num+"\nTotal: "+total);
        }
    }
}
