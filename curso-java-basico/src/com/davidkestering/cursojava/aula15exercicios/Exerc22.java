package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Infome qts kg de morangos deseja.");
        int morangokg = scan.nextInt();
        double precoMora = 2.50;
        if(morangokg>5)
            precoMora = 2.20;
        System.out.println("Informe qts kg de maças deseja.");
        int macakg = scan.nextInt();
        double precoMaca = 1.80;
        if(macakg>5)
            precoMaca = 1.50;

        int totalKg = morangokg+macakg;
        double valorCompras = (precoMora*morangokg)+(precoMaca*macakg);
        double valorTotal = valorCompras;
        //System.out.println("Valor das Compras "+valorCompras);
        //System.out.println("Valor sem desconto "+valorTotal);
        if(totalKg > 8 || valorCompras > 25)
            valorTotal = valorCompras-(valorCompras*10/100);
        System.out.println("O valor total a ser pago é R$ "+valorTotal);

    }
}
