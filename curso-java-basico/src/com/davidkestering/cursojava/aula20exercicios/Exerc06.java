package com.davidkestering.cursojava.aula20exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 25/04/2016.
 */
public class Exerc06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha=0,coluna=0;

        while(!ganhou){
            if(jogada%2==1){ //Jogador 1
                sinal = 'X';
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
            }else {
                sinal = 'O';
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
            }

            boolean linhaValida = false;
            while (!linhaValida){
                System.out.println("Informe a linha (1, 2 ou 3)");
                linha = scan.nextInt();
                if(linha>=1 && linha<=3)
                    linhaValida = true;
                else
                    System.out.println("Linha inválida. Tente novamente.");
            }

            boolean colunaValida = false;
            while (!colunaValida){
                System.out.println("Informe a coluna (1, 2 ou 3)");
                coluna = scan.nextInt();
                if(coluna>=1 && coluna<=3)
                    colunaValida = true;
                else
                    System.out.println("Coluna inválida. Tente novamente.");
            }

            linha--;
            coluna--;
            if(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O')
                System.out.println("Posição já utilizada. Tente novamente.");
            else{
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            for(int i=0;i<jogoVelha.length;i++){
                System.out.println("-------------");
                System.out.print("| ");
                for(int j=0;j<jogoVelha[i].length;j++){
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println("-------------");

            if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||
               (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||
               (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') ||
               (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') ||
               (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||
               (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') ||
               (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') ||
               (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')){
                System.out.println("Jogador 1 VENCEDOR.");
                ganhou = true;
            }else if((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') ||
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')){
                System.out.println("Jogador 2 VENCEDOR.");
                ganhou = true;
            }else{
                ganhou = false;
                if(jogada>9)
                    System.out.println("GALO!!!!");
            }
        }
    }
}
