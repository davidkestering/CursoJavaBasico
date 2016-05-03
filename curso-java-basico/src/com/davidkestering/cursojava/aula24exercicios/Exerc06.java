package com.davidkestering.cursojava.aula24exercicios;

/**
 * Created by seduc on 03/05/2016.
 */
public class Exerc06 {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.nome = "Amor";
        contato.email = "";
        contato.telefone = new String[1];
        contato.telefone[0] = "98087-3246";

        System.out.println(contato.nome);
        System.out.println(contato.email);
        System.out.println(contato.telefone[0]);
    }
}
