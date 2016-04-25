package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe qtas idades deseja digitar.");
        int qtdIdade = scan.nextInt();
        int soma = 0;
        double idade = 0;
        double media = 0;
        for(int i=1;i<=qtdIdade;i++){
            System.out.println("Informe a idade.");
            idade = scan.nextDouble();
            soma+=idade;
        }
        media = soma/qtdIdade;
        System.out.println("A media de idades é: "+media);
        if(media>60)
            System.out.println("A turma é idosa.");
        else if(media>25 && media <= 60)
            System.out.println("A turma é adulta");
        else
            System.out.println("A turma é jovem");
    }
}
