package com.davidkestering.cursojava.aula33exercicios;

import com.davidkestering.cursojava.aula27exercicios.*;

/**
 * Created by seduc on 10/05/2016.
 */
public class Exerc01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
