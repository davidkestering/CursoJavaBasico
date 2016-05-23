package com.davidkestering.cursojava.aula55;

import com.davidkestering.cursojava.aula53.DiaSemana;

/**
 * Created by seduc on 23/05/2016.
 */
public class TesteEnum2 {
    public static void main(String[] args) {
        System.out.println(Enum.valueOf(DiaSemana.class,"DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class,"DOMINGO");

        System.out.println(dia);
    }
}
