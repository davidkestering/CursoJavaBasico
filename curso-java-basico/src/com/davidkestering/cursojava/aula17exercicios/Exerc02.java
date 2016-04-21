package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valido = false;
        do{
            System.out.println("Informe o login e senha.");
            String login = scan.next();
            String senha = scan.next();
            if(login.equalsIgnoreCase(senha))
                System.out.println("A senha não pode ser igual ao login.");
            else
                valido=true;
        }while (!valido);

    }
}
