package com.davidkestering.cursojava.aula20;

import java.util.Scanner;

/**
 * Created by seduc on 25/04/2016.
 */
public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a qtd de pessoas entrevistadas");
        int qtdPessoas = scan.nextInt();

        String[][] nomeFilhos = new String[qtdPessoas][];
        for(int i=0;i<nomeFilhos.length;i++){
            System.out.println("Qts filhos");
            int qtdFilhos = scan.nextInt();

            nomeFilhos[i] = new String[qtdFilhos];
            for(int j=0;j<nomeFilhos[i].length;j++){
                System.out.println("Digite o nome do filho");
                nomeFilhos[i][j] = scan.next();
            }
        }

        for(int i=0;i<nomeFilhos.length;i++){
            System.out.println("Pessoa "+i+" tem "+nomeFilhos[i].length+" filhos.");
            for(int j=0;j<nomeFilhos[i].length;j++){
                System.out.println("Nome do filho "+j+": "+nomeFilhos[i][j]);
            }
            System.out.println();
        }

    }
}
