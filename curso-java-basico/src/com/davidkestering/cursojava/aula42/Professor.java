package com.davidkestering.cursojava.aula42;

/**
 * Created by seduc on 11/05/2016.
 */
public class Professor {
    private String curso;
    private double salario;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereco do Professor: ";
        //s += this.getEndereco();
        return s;
    }

    public void imprimirEtiquetaEndereco(){
        System.out.println(this.obterEtiquetaEndereco());
    };

}
