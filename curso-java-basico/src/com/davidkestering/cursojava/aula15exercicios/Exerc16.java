package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor a:");
        double a = scan.nextDouble();
        if(a == 0){
            System.out.println("A equação não é de segundo grau.");
        }else{
            System.out.println("Informe o valor b e c:");
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            double delta = Math.pow(b,2) - 4*a*c;
            if(delta<0){
                System.out.println("O delta é negativo, a equação não possui raízes.");
            }else if(delta==0){
                double x = -b/(2*a);
                System.out.println("O delta é zero, a equação possui apenas uma raiz. x = "+x);
            }else{
                double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("O delta é positivo, a equação possui as duas raízes. x1 = "+x1+", x2 = "+x2);
            }

        }

    }
}
