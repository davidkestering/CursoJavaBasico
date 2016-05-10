package com.davidkestering.cursojava.aula33exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 10/05/2016.
 */
public class Exerc03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Informe a matricula");
        aluno.setMatricula(scan.next());

        System.out.println("Informe o nome do curso");
        aluno.setCurso(scan.next());

        for(int i=0;i<aluno.getDisciplinas().length;i++){
            System.out.println("Informe a disciplina "+(i+1));
            aluno.setNomeDisciplinaPos(i,scan.next());
        }

        for(int i=0;i<aluno.getNotas().length;i++){
            System.out.println("Obtendo notas da disciplina "+aluno.getDisciplinas()[i]);
            for(int j=0;j<aluno.getNotas()[i].length;j++){
                System.out.println("Informe a nota "+(j+1));
                aluno.setNotaPos(i,j,scan.nextDouble());
            }
        }

        aluno.mostrarInfo();
    }
}
