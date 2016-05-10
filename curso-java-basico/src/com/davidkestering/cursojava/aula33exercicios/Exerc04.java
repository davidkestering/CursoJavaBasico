package com.davidkestering.cursojava.aula33exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 10/05/2016.
 */
public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoVelha jogoVelha = new JogoVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogoVelha.vezJogador1()) { //Jogador 1
                sinal = 'X';
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
            } else {
                sinal = 'O';
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
            }

            linha = valor("Linha",scan);
            coluna = valor("Coluna",scan);
            jogoVelha.validarJogada(linha,coluna,sinal);
            jogoVelha.imprimirTabuleiro();

            if(jogoVelha.verificarGanhador('X')){
                System.out.println("Jogador 1 VENCEDOR.");
                ganhou = true;
            }else if(jogoVelha.verificarGanhador('O')){
                System.out.println("Jogador 2 VENCEDOR.");
                ganhou = true;
            }else if(jogoVelha.getJogada()>9){
                System.out.println("GALO!!!!");
                ganhou = false;
            }
        }

    }

    static int valor(String tipoValor, Scanner scan){
        int valor=0;
        boolean valorValido = false;
        while (!valorValido){
            System.out.println("Informe a "+tipoValor+" (1, 2 ou 3)");
            valor = scan.nextInt();
            if(valor>=1 && valor<=3)
                valorValido = true;
            else
                System.out.println(tipoValor+" inválida. Tente novamente.");
        }
        valor--;
        return valor;
    }
}
