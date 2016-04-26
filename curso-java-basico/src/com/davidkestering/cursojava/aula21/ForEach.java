package com.davidkestering.cursojava.aula21;

import java.util.Random;

/**
 * Created by seduc on 26/04/2016.
 */
public class ForEach {
    public static void main(String[] args) {
        int[] notas = new int[10];
        Random random = new Random();
        for(int i=0;i<notas.length;i++){
            notas[i] = random.nextInt(10);
        }

        for(int nota : notas){
            System.out.println(nota);
        }
    }
}
