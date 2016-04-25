package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int popA = 0;
        int popB = 0;
        double taxaA = 0;
        double taxaB = 0;
        do {
            System.out.println("Informe as populações A e B");
            popA = scan.nextInt();
            popB = scan.nextInt();
            if(popA<=0 || popB <=0)
                System.out.println("As populações precisam ser maiores que zero.");
            else
                valid = true;
        }while (!valid);
        valid = false;

        do {
            System.out.println("Informe as taxas de crescimento das populações A e B");
            taxaA = scan.nextDouble();
            taxaB = scan.nextDouble();
            if(taxaA<=0 || taxaB<=0)
                System.out.println("As taxas de crescimento precisam ser maiores que zero.");
            else
                valid = true;
        }while (!valid);

        int cont=0;
        for(;popA<=popB;popA += (popA/100)*taxaA, popB += (popB/100)*taxaB){
            cont++;
        }
        System.out.println("Levará "+cont+" anos até que a população de A se iguale ou ultrapasse a população de B.\n"+
                "Totalizando a população A com "+popA+" habitantes, e a população B com "+popB+"habitantes.");
    }
}
