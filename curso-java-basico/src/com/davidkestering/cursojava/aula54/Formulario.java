package com.davidkestering.cursojava.aula54;

/**
 * Created by seduc on 23/05/2016.
 */
public class Formulario {
    enum Genero{
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero;
}
