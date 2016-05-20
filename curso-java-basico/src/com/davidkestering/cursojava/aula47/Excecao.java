package com.davidkestering.cursojava.aula47;

/**
 * Created by seduc on 20/05/2016.
 */
public class Excecao {
    public static void main(String[] args) {
        try{
            int[] vetor = new int[4];
            System.out.println("Antes da Excecao");
            vetor[4] = 1;
            System.out.println("Nao sera impresso");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Excecao ao acessar um indice do vetor que nao existe");
        }

        System.out.println("Este texto sera impresso apos a exception");
    }
}
