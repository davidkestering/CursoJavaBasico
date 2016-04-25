package com.davidkestering.cursojava.aula16;

/**
 * Created by davidkestering on 20/04/16.
 */
public class LoopWhile {
    public static void main(String[] args) {
        int i = 0;
        int max = 10;
        System.out.println("Contando ate "+max);
        while(i<max){
            System.out.println("Valor de i: "+i);
            i++;
        }

        do{
            i++;
            System.out.println("Valor de i: "+i);

        }while (i<15);

    }
}
