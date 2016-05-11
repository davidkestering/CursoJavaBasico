package com.davidkestering.cursojava.aula36exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 11/05/2016.
 */
public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do curso");
        Curso curso = new Curso();
        curso.setNomeCurso(scan.nextLine());
        System.out.println("Informe o horário");
        curso.setHorario(scan.nextLine());

        System.out.println("Informe o nome do professor");
        Professor professor = new Professor();
        professor.setNomeProfessor(scan.nextLine());
        System.out.println("Informe o departamento do professor");
        professor.setDepartamento(scan.nextLine());
        System.out.println("Informe o email do professor");
        professor.setEmail(scan.nextLine());
        if(professor != null && curso != null)
            curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[2];
        for(int i=0;i<alunos.length;i++){
            String nomeAluno="";
            String matricula="";

            System.out.println("Informe os dados do aluno "+(i+1));
            scan.nextLine(); //necessario um scan em branco para que consiga pedir para digitar o nome do aluno a partir do 2 loop
            System.out.println("Informe o nome do aluno ");
            nomeAluno = scan.nextLine();

            System.out.println("Informe a matricula ");
            matricula = scan.nextLine();

            double notas[] = new double[4];
            for(int j=0;j<notas.length;j++){
                System.out.println("Informe a nota "+(j+1));
                notas[j] = scan.nextDouble();
            }

            Aluno a = new Aluno();
            a.setNomeAluno(nomeAluno);
            a.setMatricula(matricula);
            a.setNotas(notas);
            alunos[i] = a;
        }
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }
}
