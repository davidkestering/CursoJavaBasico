package com.davidkestering.cursojava.aula46exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Circulo extends Figura2D {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (raio*raio)*Math.PI;
    }
}
