package com.davidkestering.cursojava.aula43;

/**
 * Created by seduc on 12/05/2016.
 */
public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Teste");
        double[] notas = {1,2,3,4};
        aluno.setNotas(notas);

        System.out.println(aluno);
    }
}
