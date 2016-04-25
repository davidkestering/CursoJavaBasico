package com.davidkestering.cursojava.aula19;

import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temp = new double[365];
        temp[0] = 31.3;
        temp[1] = 30;
        System.out.println(temp[2]);
        System.out.println("O tamanho do vetor "+temp.length);
        System.out.println("Os valores do vetor :");
        /*for(int i=0;i<temp.length;i++) {
            System.out.println(temp[i]);
        }*/

        //for melhorado, mas nao possui indice.
        for(double t : temp){
            System.out.println(t);
        }
    }
}
