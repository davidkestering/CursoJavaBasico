package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 19/04/2016.
 */
public class Exerc12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor que você ganha por hora e quantas horas você trabalha no mês: ");
        double valorHora = scan.nextDouble();
        int qtdHora = scan.nextInt();
        double salarioBruto = valorHora*qtdHora;

        int percentualIR = 0;
        if(salarioBruto>2500)
            percentualIR = 20;
        else if(salarioBruto>1500 && salarioBruto<=2500)
            percentualIR = 10;
        else if(salarioBruto>900 && salarioBruto<=1500)
            percentualIR = 5;

        double ir = (salarioBruto/100)*percentualIR;
        double inss = (salarioBruto/100)*10;
        double fgts = (salarioBruto/100)*11;
        double sindicato = (salarioBruto/100)*3;
        double totalDescontos = ir+inss+sindicato;
        double salarioLiquido = salarioBruto-totalDescontos;
        System.out.println("Seu salário bruto é de: "+salarioBruto+"\n" +
                            "Seu (-) IR é: "+ir+"\nSeu (-) INSS é: "+inss+"\n" +
                            "Seu FGTS é: "+fgts+"\n" +
                            "Seu sindicato é: "+sindicato+"\n" +
                            "Total de descontos e: "+totalDescontos+"\n"+
                            "Seu salário líquido é de: "+salarioLiquido);
    }
}
