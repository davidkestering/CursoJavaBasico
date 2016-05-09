package com.davidkestering.cursojava.aula27exercicios;

/**
 * Created by seduc on 09/05/2016.
 */
public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[disciplinas.length][4];

    void mostrarInfo(){
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

    boolean verificarAprovado(int indice){
        double media = obterMedia(indice);
        if(media>=7)
            return true;
        return false;
    }

    double obterMedia(int indice){
        double soma=0;
        double media=0;
        for(int i=0;i<notas[indice].length;i++){
            soma += notas[indice][i];
        }
        media = soma/4;
        return media;
    }

}
