package com.davidkestering.cursojava.aula25;

/**
 * Created by seduc on 03/05/2016.
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+capCombustivel*consumoCombustivel+"km");
    }
}
