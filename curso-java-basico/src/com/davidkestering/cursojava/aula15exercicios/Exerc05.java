package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe as notas do aluno");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;
        System.out.println("Media: "+media);
        if(media < 7)
            System.out.println("Reprovado");
        else if(media >= 7 && media < 10)
            System.out.println("Aprovado");
        else if(media == 10)
            System.out.println("Aprovado com distinção");
    }
}
