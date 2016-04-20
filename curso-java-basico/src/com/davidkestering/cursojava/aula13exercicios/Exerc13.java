package com.davidkestering.cursojava.aula13exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor que você ganha por hora e quantas horas você trabalha no mês: ");
        double valorHora = scan.nextDouble();
        int qtdHora = scan.nextInt();
        double salarioBruto = valorHora*qtdHora;
        double ir = (salarioBruto/100)*11;
        double inss = (salarioBruto/100)*8;
        double sindicato = (salarioBruto/100)*5;
        double totalDescontos = ir+inss+sindicato;
        double salarioLiquido = salarioBruto-totalDescontos;
        System.out.println("Seu salário bruto é de: "+salarioBruto+"\n" +
                           "Seu IR é: "+ir+"\nSeu INSS é: "+inss+"\n" +
                           "Seu sindicato é: "+sindicato+"\n" +
                           "Total de descontos e: "+totalDescontos+"\n"+
                           "Seu salário líquido é de: "+salarioLiquido);
    }
}
