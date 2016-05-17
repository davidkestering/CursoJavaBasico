package com.davidkestering.cursojava.aula44;

/**
 * Created by seduc on 17/05/2016.
 */
public abstract class Animal {
    private String nome;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
