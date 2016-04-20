package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 19/04/2016.
 */
public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o salario: ");
        double salario = scan.nextDouble();
        int percentual;
        double aumento;
        double novoSalario;

        if(salario>=1500)
            percentual = 05;
        else if(salario>=700 && salario<1500)
            percentual = 10;
        else if(salario>=280 && salario<700)
            percentual = 15;
        else
            percentual = 20;

        aumento = (salario/100)*percentual;
        novoSalario = salario+aumento;
        System.out.println("Seu salario atual é: "+salario+"\n" +
                "Seu percentual de aumento é: "+percentual+"%\n" +
                "O valor a ser aumentado é: "+aumento+"\n" +
                "Seu novo salario é: "+novoSalario);
    }
}
