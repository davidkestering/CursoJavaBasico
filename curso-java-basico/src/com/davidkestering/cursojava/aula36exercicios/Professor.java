package com.davidkestering.cursojava.aula36exercicios;

/**
 * Created by seduc on 11/05/2016.
 */
public class Professor {
    private String nomeProfessor;
    private String departamento;
    private String email;

    public Professor() {
    }

    public Professor(String departamento, String nomeProfessor, String email) {
        this.departamento = departamento;
        this.nomeProfessor = nomeProfessor;
        this.email = email;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo(){
        String info = "Nome do Professor: "+this.getNomeProfessor()+"\n Departamento: "+this.getDepartamento()+"\n Email: "+this.getEmail()+"\n\n";
        return info;
    }
}
