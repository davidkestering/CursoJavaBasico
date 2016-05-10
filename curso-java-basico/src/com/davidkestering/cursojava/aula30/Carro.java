package com.davidkestering.cursojava.aula30;

/**
 * Created by seduc on 10/05/2016.
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    void exibirAutonomia(){

        System.out.println("A autonomia do carro é: "+this.obterAutonomia()+"km");
    }

    double obterAutonomia(){
        System.out.println("O metodo obterAutonomia foi chamado.");
        return this.capCombustivel*this.consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km/this.consumoCombustivel;
        return qtdCombustivel;
    }


}
