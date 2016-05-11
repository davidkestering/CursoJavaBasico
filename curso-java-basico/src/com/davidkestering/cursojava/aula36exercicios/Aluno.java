package com.davidkestering.cursojava.aula36exercicios;

/**
 * Created by seduc on 11/05/2016.
 */
public class Aluno {
    private String nomeAluno;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo(){
        String info = "Nome do aluno: "+this.getNomeAluno()+"\n Matricula: "+this.getMatricula()+"\n";
        if(this.getNotas() != null){
            info += "Notas: ";
            for(int i=0;i<this.getNotas().length;i++){
                info += this.getNotas()[i]+" ";
            }
            info += "- Média: "+this.obterMedia();
            if(this.obterMedia() >= 7)
                info += " -> APROVADO";
            else
                info += " -> REPROVADO";
        }

        info += "\n";
        return info;
    }

    public double obterMedia(){
        double total=0;
        if(this.getNotas() != null){
            for(int i=0;i<this.getNotas().length;i++){
                total+=this.getNotas()[i];
            }
        }
        double media = total/4;
        return media;
    }

}
