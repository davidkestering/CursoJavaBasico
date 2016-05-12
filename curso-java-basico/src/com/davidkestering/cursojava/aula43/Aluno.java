package com.davidkestering.cursojava.aula43;

import java.util.Arrays;

/**
 * Created by seduc on 11/05/2016.
 */
public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
        //super(nome, endereco, telefone, cpf);
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
        //s += this.getEndereco();
        return s;
    }

    public void imprimirEtiquetaEndereco(){
        System.out.println(this.obterEtiquetaEndereco());
    };

    /*public String toString(){
        String s = this.curso + "\n";
        for (double nota: this.notas){
            s += nota + " ";
        }
        return s;
    }*/

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (curso.equalsIgnoreCase(aluno.getCurso())){
            return true;
        } else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        int result = curso != null ? curso.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }
}
