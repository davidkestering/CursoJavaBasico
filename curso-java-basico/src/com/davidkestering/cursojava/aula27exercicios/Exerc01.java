package com.davidkestering.cursojava.aula27exercicios;

/**
 * Created by seduc on 09/05/2016.
 */
public class Exerc01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();
    }
}
