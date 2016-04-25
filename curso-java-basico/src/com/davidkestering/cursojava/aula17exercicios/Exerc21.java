package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a qtde turmas.");
        int qtdTurmas = scan.nextInt();
        int qtdAlunos = 0;
        int somaAlunos = 0;
        double mediaAlunos = 0;
        int i=1;
        do{
            System.out.println("Informe a qtde alunos.");
            qtdAlunos = scan.nextInt();
            if(qtdAlunos>40){
                System.out.println("A qtde de alunos nao pode ser maior que 40.");
            }else {
                somaAlunos += qtdAlunos;
                i++;
            }
        }while (i<=qtdTurmas);
        mediaAlunos = somaAlunos/qtdTurmas;
        System.out.println("A media de alunos por turma é de "+mediaAlunos);
    }
}
