package com.davidkestering.cursojava.aula46exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Piramide extends Figura3D {
    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;
    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public double calculaAreaLateral(){
        return (numPoliBase * (arestaBase*apotema))/2;
    }

    @Override
    public double calcularArea() {
        if(base != null)
            return calculaAreaLateral() + base.calcularArea();
        else
            return 0;
    }

    @Override
    public double calcularVolume() {
        if(base != null)
            return (base.calcularArea() * altura)/3;
        else
            return 0;
    }
}
