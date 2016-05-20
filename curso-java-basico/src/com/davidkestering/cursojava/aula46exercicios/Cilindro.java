package com.davidkestering.cursojava.aula46exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Cilindro extends Figura3D {
    private double altura;
    private double raio;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularAreaBase(){
        return Math.PI*(raio*raio);
    }

    public double calcularAreaLateral(){
        return 2 * (Math.PI*raio*altura);
    }

    @Override
    public double calcularArea() {
        return (2 * calcularAreaBase()) + calcularAreaLateral();
    }

    @Override
    public double calcularVolume() {
        return (Math.PI*(raio*raio)*altura);
    }
}
