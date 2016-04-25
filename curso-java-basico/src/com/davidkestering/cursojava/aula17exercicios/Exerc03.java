package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        do{
            System.out.println("Digite seu nome.");
            String nome = scan.next();
            if(nome.length() < 3)
                System.out.println("A qtde de caracteres tem que ser maior que 3.");
            else
                valid = true;
        }while (!valid);
        valid = false;

        do{
            System.out.println("Digite sua idade.");
            int idade = scan.nextInt();
            if(idade < 0 || idade > 150)
                System.out.println("A idade precisa ser entre 0 e 150.");
            else
                valid = true;
        }while (!valid);
        valid = false;

        do{
            System.out.println("Informe seu salário.");
            double salario = scan.nextDouble();
            if(salario<=0)
                System.out.println("O salário tem que ser maior que 0");
            else
                valid = true;
        }while (!valid);
        valid = false;

        do {
            System.out.println("Informe o sexo.");
            String sexo = scan.next();
            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))
                valid = true;
            else
                System.out.println("O sexo precisa ser f ou m");
        }while (!valid);
        valid = false;

        do{
            System.out.println("Informe o estado civil.");
            String estadoCivil = scan.next();
            if(estadoCivil.equalsIgnoreCase("s") ||
               estadoCivil.equalsIgnoreCase("c") ||
               estadoCivil.equalsIgnoreCase("v") ||
               estadoCivil.equalsIgnoreCase("d"))
                valid = true;
            else
                System.out.println("O estado civil precisa ser ou s, ou c, ou v, ou d.");
        }while (!valid);


    }
}
