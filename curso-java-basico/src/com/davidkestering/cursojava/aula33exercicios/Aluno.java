package com.davidkestering.cursojava.aula33exercicios;

/**
 * Created by seduc on 10/05/2016.
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno() {
        this.disciplinas = new String[3];
        this.notas = new double[this.getDisciplinas().length][4];
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[this.getDisciplinas().length][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void mostrarInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Curso: "+curso);
        for(int i=0;i<disciplinas.length;i++){
            System.out.print("Disciplina "+disciplinas[i]+": ");
            for(int j=0;j<notas[i].length;j++){
                System.out.print(" "+notas[i][j]);
            }
            System.out.print(" - Media: "+obterMedia(i));
            if(verificarAprovado(i))
                System.out.print(" -> Aprovado");
            else
                System.out.print(" -> Reprovado");
            System.out.println("");
        }
    }

    public boolean verificarAprovado(int indice){
        double media = obterMedia(indice);
        if(media>=7)
            return true;
        return false;
    }

    public double obterMedia(int indice){
        double soma=0;
        double media=0;
        for(int i=0;i<notas[indice].length;i++){
            soma += notas[indice][i];
        }
        media = soma/4;
        return media;
    }

    public void setNomeDisciplinaPos(int pos, String disciplina){
        this.disciplinas[pos] = disciplina;
    }

    public void setNotaPos(int posI, int posJ, double nota){
        this.notas[posI][posJ] = nota;
    }

}
