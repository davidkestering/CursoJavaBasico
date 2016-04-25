package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o numero da tabuada que desejas");
        int valor;
        valor = scan.nextInt();
        System.out.println("Informe o valor que inicia o cálculo.");
        int comeco;
        comeco = scan.nextInt();
        int fim;
        do{
            System.out.println("Informe o valor que termina o cálculo.");
            fim = scan.nextInt();
            if(fim<comeco)
                System.out.println("O valor que termina o cálculo precisa ser maior que o valor que começa.");
        }while (fim<comeco);

        System.out.println("Montar tabuada de "+valor);
        System.out.println("Começa em "+comeco);
        System.out.println("Termina em "+fim);
        for(int i=comeco;i<=fim;i++){
            System.out.println(valor+" * "+i+" = "+(valor*i));
        }
    }
}
