package com.davidkestering.cursojava.aula24exercicios;

/**
 * Created by seduc on 03/05/2016.
 */
public class Exerc03 {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();
        livro.nome = "Mastering em EXJ";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 10.73;

        System.out.println(livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.preco);
    }
}
