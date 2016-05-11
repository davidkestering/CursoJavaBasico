package com.davidkestering.cursojava.aula36exercicios;

/**
 * Created by seduc on 11/05/2016.
 */
public class Curso {
    private String nomeCurso;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {
    }

    public Curso(String nomeCurso, String horario) {
        this.nomeCurso = nomeCurso;
        this.horario = horario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo(){
        String info = "Nome do curso: "+this.getNomeCurso()+"\n Horário: "+this.getHorario()+"\n";
        if(this.getProfessor() != null)
            info += this.getProfessor().obterInfo();

        if(this.getAlunos() != null){
            for(Aluno a: this.getAlunos()){
                info += a.obterInfo();
            }
        }

        return info;
    }

}
