package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        String sair = "n";
        int cont=0;
        double soma = 0;
        do{
            System.out.println("Informe a temperatura. (s para sair depois de uma temperatura)");
            temp = scan.nextDouble();
            sair = scan.next();
            if(temp>maior)
                maior = temp;
            if(temp<menor)
                menor = temp;
            soma += temp;
            cont++;
        }while (sair.equalsIgnoreCase("n"));
        double media = soma/cont;
        System.out.println("A maior temperatura é "+maior);
        System.out.println("A menor temperatura é "+menor);
        System.out.println("A média das temperaturas é "+media);
    }
}
