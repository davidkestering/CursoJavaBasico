package com.davidkestering.cursojava.aula55;

import com.davidkestering.cursojava.aula54.DiaSemana;

/**
 * Created by seduc on 23/05/2016.
 */
public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

        for(int i=0;i<dias.length;i++){
            System.out.println(dias[i]);
        }

        for(DiaSemana dia: DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
