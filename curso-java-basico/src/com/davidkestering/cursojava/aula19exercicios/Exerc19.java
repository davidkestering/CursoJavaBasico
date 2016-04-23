package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 23/04/16.
 */
public class Exerc19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdAlunos = 10;
        double[] nota1 = new double[qtdAlunos];
        double[] nota2 = new double[qtdAlunos];
        double[] result = new double[qtdAlunos];
        for(int i=0;i<qtdAlunos;i++){
            System.out.println("Informe as notas do aluno "+i);
            nota1[i] = scan.nextDouble();
            nota2[i] = scan.nextDouble();
            result[i] = (nota1[i]+nota2[i])/2;
        }

        for(int i=0;i<qtdAlunos;i++){
            System.out.print("O aluno "+i+" obteve as notas: "+nota1[i]+" e "+nota2[i]+", cuja média é "+result[i]);
            if(result[i]>=7)
                System.out.print(", APROVADO!\n");
            else
                System.out.print(", REPROVADO!\n");
        }
    }
}
