package com.davidkestering.cursojava.aula43exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Animal {
    private String nome;
    private double comprimento;
    private int qtdPatas = 4;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
    }

    public Animal(String nome, double comprimento, int qtdPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.qtdPatas = qtdPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", qtdPatas=" + qtdPatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
