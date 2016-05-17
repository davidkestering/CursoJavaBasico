package com.davidkestering.cursojava.aula46exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Quadrado extends Figura2D {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
