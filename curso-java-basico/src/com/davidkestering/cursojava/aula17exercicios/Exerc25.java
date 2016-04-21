package com.davidkestering.cursojava.aula17exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 21/04/16.
 */
public class Exerc25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String novaCompra;
        boolean continuar = false;
        do {
            System.out.println("Deseja registrar nova compra (S/N)");
            novaCompra = scan.next();
            switch (novaCompra){
                case "s":
                case "S":
                    double valorProduto;
                    double somaValor = 0;
                    int qtdeProduto = 0;
                    int i=1;

                    String saida = "Lojas Tabajara";

                    do{
                        System.out.println("Informe o valor do produto "+i);
                        valorProduto = scan.nextDouble();
                        saida += "\nProduto "+i+": R$ "+valorProduto;
                        somaValor += valorProduto;
                        i++;
                    }while (valorProduto!=0);

                    System.out.println("Informe o valor de dinheiro que o cliente está pagando.");
                    double dinheiro = scan.nextDouble();
                    double troco = dinheiro-somaValor;

                    saida += "\nTotal: R$ "+somaValor;
                    saida += "\nDinheiro: R$ "+dinheiro;
                    saida += "\nTroco: R$ "+troco;

                    System.out.println(saida);
                break;
                case "n":
                case "N": continuar = true; break;
            }
        }while (!continuar);

    }
}
