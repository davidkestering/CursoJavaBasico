package com.davidkestering.cursojava.aula15exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 20/04/2016.
 */
public class Exerc20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? (S/N)");
        int cont = 0;
        String resp = "";
        resp = scan.next();
        if(resp.equalsIgnoreCase("S"))
            cont++;

        System.out.println("Esteve no local do crime? (S/N)");
        resp = scan.next();
        if(resp.equalsIgnoreCase("S"))
            cont++;

        System.out.println("Mora perto da vítima? (S/N)");
        resp = scan.next();
        if(resp.equalsIgnoreCase("S"))
            cont++;

        System.out.println("Devia para a vítima? (S/N)");
        resp = scan.next();
        if(resp.equalsIgnoreCase("S"))
            cont++;

        System.out.println("Já trabalhou com a vítima? (S/N)");
        resp = scan.next();
        if(resp.equalsIgnoreCase("S"))
            cont++;

        System.out.println("Suas respostas deram "+cont);
        switch (cont){
            //case 1: System.out.println("Inocente"); break;
            case 2: System.out.println("Suspeita"); break;
            case 3:
            case 4: System.out.println("Cúmplice"); break;
            case 5: System.out.println("Assassino"); break;
            default: System.out.println("Inocente"); break;
        }

    }
}
