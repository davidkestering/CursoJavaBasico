package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double popA = 80000;
        double popB = 200000;
        double taxaA = 3.0;
        double taxaB = 1.5;
        int cont=0;
        for(;popA<=popB;popA += (popA/100)*taxaA, popB += (popB/100)*taxaB){
            cont++;
        }
        System.out.println("Levará "+cont+" anos até que a população de A se iguale ou ultrapasse a população de B.\n"+
                            "Totalizando a população A com "+popA+" habitantes, e a população B com "+popB+"habitantes.");
    }
}
