package com.davidkestering.cursojava.aula17;

/**
 * Created by davidkestering on 20/04/16.
 */
public class LoopFor {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("Valor de i: "+i);
        }

        for(int i=10;i>0;i--){
            System.out.println("Valor de i: "+i);
        }

        for(int i=0, j=10;i<j;i++,j--){
            System.out.println("Valor de i: "+i+", valor de j: "+j);
        }

        int i=0;
        for(;i<5;){
            System.out.println("Valor de i: "+i);
            i++;
        }

        //loop infinito for(;;);

        int soma=0;
        for( i=0;i<5; soma += i++);
        System.out.println("Valor da soma é "+soma);

    }
}
