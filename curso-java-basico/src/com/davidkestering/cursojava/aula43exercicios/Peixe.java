package com.davidkestering.cursojava.aula43exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Peixe extends Animal {
    private String caracteristicas = "Barbatanas e cauda";

    public Peixe() {
        this.setQtdPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
    }

    public Peixe(String caracteristicas) {
        this.setQtdPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "caracteristicas='" + caracteristicas + '\'' +
                "} " + super.toString();
    }
}
