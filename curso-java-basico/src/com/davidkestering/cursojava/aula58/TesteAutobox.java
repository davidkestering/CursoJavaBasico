package com.davidkestering.cursojava.aula58;

/**
 * Created by seduc on 24/05/2016.
 */
public class TesteAutobox {
    public static void main(String[] args) {
        //classes wrapper sao as classes dos tipos primitivos
        //autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 1000l;
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        Character a2 = 'b';


        //auto un-boxing
        int num13 = num9; //mesma coisa que num9.intValue()

        //autoboxing em expressoes
        num9++;
        System.out.println(num9);

        //auto un-boxing num9 -> autoboxing num13/num9 -> num14
        Integer num14 = num13/num9;

        //mau uso
        Double a,b,c;
        a = 10.0;
        b = 12.2;
        c = 4.7;

        Double media = (a+b+c)/3;
        System.out.println(media);


    }
}
