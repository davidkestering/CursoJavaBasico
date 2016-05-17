package com.davidkestering.cursojava.aula45;

/**
 * Created by seduc on 17/05/2016.
 */
public class Teste2 {
    public static void main(String[] args) {
        Object objeto1 = obterString();
        String s1 = (String) objeto1; //downcast

        Object obj2 = "Minha String";
        String s2 = (String) obj2; //downcast

        Object obj3 = new Object();
        String s3 = (String) obj3;

        Object obj4 = obterInteiro();
        String s4 = (String) obj4;
    }

    public static String obterString(){
        return "Minha String";
    }

    public static int obterInteiro(){
        return 1;
    }
}
