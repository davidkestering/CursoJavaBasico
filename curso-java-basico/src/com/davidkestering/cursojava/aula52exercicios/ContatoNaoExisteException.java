package com.davidkestering.cursojava.aula52exercicios;

/**
 * Created by seduc on 23/05/2016.
 */
public class ContatoNaoExisteException extends Exception {
    private String nome;

    public ContatoNaoExisteException(String nome) {
        this.nome = nome;
    }

    @Override
    public String getMessage() {
        return "O contato "+nome+" não foi encontrado!";
    }
}
