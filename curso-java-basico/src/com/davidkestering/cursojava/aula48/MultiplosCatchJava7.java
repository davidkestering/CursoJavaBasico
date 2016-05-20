package com.davidkestering.cursojava.aula48;

/**
 * Created by seduc on 20/05/2016.
 */
public class MultiplosCatchJava7 {
    public static void main(String[] args) {
        int[] numeros = {4,8,16,32,64,128};
        int[] denominadores = {2,0,4,8,0};

        for(int i=0;i<numeros.length;i++){
            try {
                System.out.println(numeros[i]+" / "+denominadores[i]+" = "+(numeros[i]/denominadores[i]));
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException exc){
                System.out.println("Ocorreu um erro");
            }

        }
    }
}
