package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o turno que você estuda.");
        String turno = scan.next();
        switch (turno){
            case "m":
            case "M": System.out.println("Matutino. Bom dia!"); break;
            case "v":
            case "V": System.out.println("Vespertino. Boa Tarde!"); break;
            case "n":
            case "N": System.out.println("Noturno. Boa Noite!"); break;
            default: System.out.println("Valor inválido.");
        }
    }
}
