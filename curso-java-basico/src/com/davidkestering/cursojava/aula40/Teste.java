package com.davidkestering.cursojava.aula40;

/**
 * Created by seduc on 12/05/2016.
 */
public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua Nova, numero 1");
        aluno.setEndereco("Rua Velha, numero 1");
        professor.setEndereco("Rua Teste, numero 1");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());

    }
}
