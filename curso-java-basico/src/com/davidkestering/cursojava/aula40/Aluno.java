package com.davidkestering.cursojava.aula40;

/**
 * Created by seduc on 11/05/2016.
 */
public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereco do Aluno: ";
        s += this.getEndereco();
        return s;
    }

}
