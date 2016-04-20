package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe as notas do aluno: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;
        String aproveitamento = "";
        String mensagem = "";
        if(media<4)
            aproveitamento = "E";
        else if(media>=4 && media<6)
            aproveitamento = "D";
        else if(media>=6 && media<7.5)
            aproveitamento = "C";
        else if(media>=7.5 && media<9)
            aproveitamento = "B";
        else
            aproveitamento = "A";

        switch (aproveitamento){
            case "A":
            case "B":
            case "C": mensagem = "APROVADO"; break;
            default: mensagem = "REPROVADO"; break;
        }

        System.out.println("Suas notas foram: Nota1 - "+nota1+", Nota2 - "+nota2+"\n"+
                            "Sua média foi: "+media+"\n"+
                            "Seu conceito é: "+aproveitamento+"\n"+
                            "Você está "+mensagem);
    }
}
