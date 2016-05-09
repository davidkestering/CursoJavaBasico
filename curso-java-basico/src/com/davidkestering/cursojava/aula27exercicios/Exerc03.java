package com.davidkestering.cursojava.aula27exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 09/05/2016.
 */
public class Exerc03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Informe a matricula");
        aluno.matricula = scan.next();

        System.out.println("Informe o nome do curso");
        aluno.curso = scan.next();

        for(int i=0;i<aluno.disciplinas.length;i++){
            System.out.println("Informe a disciplina "+(i+1));
            aluno.disciplinas[i] = scan.next();
        }

        for(int i=0;i<aluno.notas.length;i++){
            System.out.println("Obtendo notas da disciplina "+aluno.disciplinas[i]);
            for(int j=0;j<aluno.notas[i].length;j++){
                System.out.println("Informe a nota "+(j+1));
                aluno.notas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

    }
}
