package com.davidkestering.cursojava.aula24exercicios;

import java.util.Date;

/**
 * Created by seduc on 03/05/2016.
 */
public class Exerc04 {
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca();
        livro.nome = "Teste";
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.usuario = "David";

        System.out.println(livro.nome);
        System.out.println(livro.emprestado);
        System.out.println(livro.dataEntrega);
        System.out.println(livro.usuario);
    }
}
