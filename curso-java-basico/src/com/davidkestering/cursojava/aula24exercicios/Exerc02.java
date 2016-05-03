package com.davidkestering.cursojava.aula24exercicios;

/**
 * Created by seduc on 03/05/2016.
 */
public class Exerc02 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Mastering em EXJ";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        System.out.println(livro.nome);
        System.out.println(livro.autor);
    }
}
