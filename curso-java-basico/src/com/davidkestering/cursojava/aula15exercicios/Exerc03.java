package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 18/04/2016.
 */
public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o sexo");
        String sexo = scan.next();
        if(sexo.equalsIgnoreCase("f"))
            System.out.println("O sexo informado é feminino");
        else if(sexo.equalsIgnoreCase("m"))
            System.out.println("O sexo informado é masculino");
        else
            System.out.println("Sexo inválido.");
    }
}
