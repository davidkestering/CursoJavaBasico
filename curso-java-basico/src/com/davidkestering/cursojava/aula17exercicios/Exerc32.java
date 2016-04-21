package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean sair = false;
        int codPedido;
        int qtdPedido;
        String finalizar;
        String saida = "";
        double preco =0;
        String item;
        double soma = 0;
        double total = 0;
        do{
            System.out.println("Informe o codigo do pedido e quantos deseja. Apos informe se deseja sair (s/n)");
            codPedido = scan.nextInt();
            qtdPedido = scan.nextInt();
            finalizar = scan.next();

            switch (codPedido){
                case 100:
                    preco = 1.20;
                    soma = preco*qtdPedido;
                    total += soma;
                    saida += "Cachorro Quente - "+qtdPedido+"x "+soma+"\n";
                    break;
                case 103:
                    preco = 1.20;
                    soma = preco*qtdPedido;
                    total += soma;
                    saida += "Hamburguer - "+qtdPedido+"x "+soma+"\n";
                    break;
                case 101:
                    preco = 1.30;
                    soma = preco*qtdPedido;
                    total += soma;
                    saida += "Bauru Simples - "+qtdPedido+"x "+soma+"\n";
                    break;
                case 104:
                    preco = 1.30;
                    soma = preco*qtdPedido;
                    total += soma;
                    saida += "Cheeseburguer - "+qtdPedido+"x "+soma+"\n";
                    break;
                case 102:
                    preco = 1.50;
                    soma = preco*qtdPedido;
                    total += soma;
                    saida += "Bauru com ovo - "+qtdPedido+"x "+soma+"\n";
                    break;
                case 105:
                    preco = 1.00;
                    soma = preco*qtdPedido;
                    total += soma;
                    saida += "Refrigerante - "+qtdPedido+"x "+soma+"\n";
                    break;
            }


            if(finalizar.equalsIgnoreCase("s"))
                sair=true;
        }while (!sair);

        System.out.println("Pedidos: ");
        System.out.println(saida);
        System.out.println("Total: "+total);
    }
}
