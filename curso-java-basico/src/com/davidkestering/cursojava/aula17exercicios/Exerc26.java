package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número que desejas o fatorial");
        int num = scan.nextInt();
        int total = 1;
        System.out.println("Fatorial de "+num);
        String saida = num+"! = ";
        for(;num>=1;num--){
            total*=num;
            if (num == 1)
                saida += num+" = "+total;
            else
                saida += num+" * ";
            //System.out.println("Num: "+num+"\nTotal: "+total);
        }
        System.out.println(saida);
    }
}
