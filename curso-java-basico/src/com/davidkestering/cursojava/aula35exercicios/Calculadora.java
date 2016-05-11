package com.davidkestering.cursojava.aula35exercicios;

/**
 * Created by seduc on 11/05/2016.
 */
public class Calculadora {
    public static int fibonacci(int num) {
        if(num<2)
            return 1;
        return fibonacci(num-1)+fibonacci(num-2);
    }

    public static int somatorio(int num){
        if(num<=0)
            return 0;
        return num+somatorio(num-1);
    }
}
