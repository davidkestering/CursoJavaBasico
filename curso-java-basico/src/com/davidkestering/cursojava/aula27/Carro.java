package com.davidkestering.cursojava.aula27;

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
        System.out.println("A autonomia do carro é: "+obterAutonomia()+"km");
    }

    double obterAutonomia(){
        System.out.println("O metodo obterAutonomia foi chamado.");
        return capCombustivel*consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
