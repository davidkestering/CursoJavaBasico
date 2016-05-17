package com.davidkestering.cursojava.aula43exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 17/05/2016.
 */
public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contribuinte contribuinte = new Contribuinte();
        double valorImposto=0;
        for(int i=1;i<=6;i++){
            System.out.println("Informe o nome do Contribuinte");
            contribuinte.setNome(scan.next());
            System.out.println("É pessoa física? (S/N)");
            contribuinte.setTipoPessoaPF(false);
            if(scan.next().equalsIgnoreCase("S"))
                contribuinte.setTipoPessoaPF(true);
            System.out.println("Informe a renda bruta");
            valorImposto = contribuinte.calculaImposto(scan.nextDouble());
            System.out.println("O imposto devido é "+valorImposto);
        }
    }
}
