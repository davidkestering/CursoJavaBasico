package com.davidkestering.cursojava.aula14;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Informe a idade: ");
        /*int idade = scan.nextInt();
        if(idade >= 18)
            System.out.println("É maior de idade");
        else
            System.out.println("É menor de idade");*/

        System.out.println("Informe o valor");
        double valor = scan.nextDouble();
        if(valor<=10)
            System.out.println("Barato");
        else if(valor>10 && valor<15)
            System.out.println("Pedir desconto");
        else if(valor>=15 && valor<17)
            System.out.println("Pesquisar mais");
        else
            System.out.println("Nao comprar");

    }
}
