package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tipo de combustível.");
        String tipo = scan.next();
        System.out.println("Informe a qtd litros;");
        double qtdLitros = scan.nextDouble();
        int desconto = 0;
        double preco = 0;
        switch (tipo){
            case "A":
                preco = 1.90;
                desconto = 3;
                if (qtdLitros>20)
                    desconto = 5;
                break;
            case "G":
                preco = 2.50;
                desconto = 4;
                if(qtdLitros>20)
                    desconto = 6;
                break;
        }

        double totalDesconto = (preco*desconto)/100;
        double valorTotal = (preco-totalDesconto)*qtdLitros;

        System.out.println("O tipo escolhido foi "+tipo+"\n"+
                            "A quantidade de litros é "+qtdLitros+"\n"+
                            "A porcentagem de desconto é "+desconto+"%\n"+
                            "O valor descontado por litro é "+totalDesconto+"\n"+
                            "O valor total a ser pago é "+valorTotal);

    }
}
