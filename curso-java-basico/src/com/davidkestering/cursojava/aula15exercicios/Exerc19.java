package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dois números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Infome a operação: (+, -, /, *)");
        String op = scan.next();
        double resultado = 0;
        String mensagem = "";
        boolean erro = false;
        switch (op){
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "/":
                if(num2 == 0) {
                    System.out.println("Operação não pode ser realizada, pois o segundo número é zero. Não se divide por zero.");
                    erro = true;
                }else
                    resultado = num1/num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            default: System.out.println("Operação Inválida!"); erro = true; break;
        }

        if(erro == true){

        }else {
            if (resultado % 2 == 0)
                mensagem = "O resultado é par.";
            else
                mensagem = "O resultado é impar.";

            if (resultado < 0)
                mensagem += " O resultado é negativo.";
            else
                mensagem += " O resultado é positivo.";

            System.out.println("O resultado da operação é " + resultado + ". " + mensagem);
        }
    }
}
