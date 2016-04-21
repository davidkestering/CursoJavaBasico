package com.davidkestering.cursojava.aula17exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o salario.");
        double salario = scan.nextDouble();
        int anoInicial = 1996;
        double porcAum = 1.5;
        double aumento = (salario*porcAum)/100;
        int i=anoInicial;
        double novoSalario = salario+aumento;
        DecimalFormat format = new DecimalFormat("###,###.##");
        do{
            System.out.println("Salário no ano "+i+": "+format.format(salario));
            System.out.println("Porcentagem de aumento no ano "+i+": "+porcAum+"%");
            System.out.println("Novo salário no ano "+i+": "+format.format(novoSalario)+"\n");
            porcAum = porcAum*2;
            salario = novoSalario;
            aumento = (salario*porcAum)/100;
            novoSalario = salario+aumento;

            i++;
        }while (i<=2016);
    }
}
