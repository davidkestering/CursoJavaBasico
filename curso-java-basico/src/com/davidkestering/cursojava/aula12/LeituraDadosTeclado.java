package com.davidkestering.cursojava.aula12;

import java.util.Scanner;

/**
 * Created by davidkestering on 17/04/16.
 */
public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: "+nomeCompleto);

        System.out.println("Digite o seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: "+primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: "+idade);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: "+altura);*/

        System.out.println("Digite seu primeiro nome, idade, qtd filhos, altura e se tem bicho de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        double altura = scan.nextDouble();
        boolean temPet = scan.nextBoolean();
        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: "+primeiroNome);
        System.out.println("Idade: "+idade);
        System.out.println("Qtd Filhos: "+qtdFilhos);
        System.out.println("Altura: "+altura);
        System.out.println("Tem bicho de estimação: "+temPet);

    }
}
