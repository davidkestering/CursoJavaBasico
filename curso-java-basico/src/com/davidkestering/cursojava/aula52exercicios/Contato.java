package com.davidkestering.cursojava.aula52exercicios;

/**
 * Created by seduc on 23/05/2016.
 */
public class Contato {
    private static int contador = 0;
    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        contador++;
        id = contador;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
