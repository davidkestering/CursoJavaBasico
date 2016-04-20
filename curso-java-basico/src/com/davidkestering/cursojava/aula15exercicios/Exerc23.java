package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tipo de carne que deseja: (F/A/P)");
        String tipo = scan.next();
        System.out.println("Informe qts kg deseja comprar.");
        int kg = scan.nextInt();
        System.out.println("Informe a forma de pagamento. (C/D)");
        String formaPag = scan.next();

        int descontoPag = 0;
        if(formaPag.equalsIgnoreCase("c"))
            descontoPag = 5;

        double preco = 0;
        switch (tipo){
            case "F":
                preco = 4.90;
                if(kg>5)
                    preco = 5.80;
                break;
            case "A":
                preco = 5.90;
                if(kg>5)
                    preco = 6.80;
                break;
            case "P":
                preco = 6.90;
                if(kg>5)
                    preco = 7.80;
                break;
        }

        double valorDesconto = (preco*descontoPag/100);
        //System.out.println(valorDesconto);
        double valorTotal = (preco-valorDesconto)*kg;
        System.out.println("Você escolheu o tipo de carne "+tipo+"\n"+
                            "Você escolheu a qtde de "+kg+"kg\n"+
                            "O preço total é de "+(valorTotal+valorDesconto)+"\n"+
                            "O tipo de pagamento é "+formaPag+"\n"+
                            "O valor de desconto é de "+valorDesconto+"\n"+
                            "O valor a pagar é de "+valorTotal);

    }
}
