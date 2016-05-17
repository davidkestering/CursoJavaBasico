package com.davidkestering.cursojava.aula43exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Mamifero extends Animal {
    private String alimentoPreferido = "Mel";

    public Mamifero() {
        this.setAmbiente("Terra");
    }

    public Mamifero(String alimentoPreferido) {
        this.setAmbiente("Terra");
        this.alimentoPreferido = alimentoPreferido;
    }

    public String getAlimentoPreferido() {
        return alimentoPreferido;
    }

    public void setAlimentoPreferido(String alimentoPreferido) {
        this.alimentoPreferido = alimentoPreferido;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "alimentoPreferido='" + alimentoPreferido + '\'' +
                "} " + super.toString();
    }
}
