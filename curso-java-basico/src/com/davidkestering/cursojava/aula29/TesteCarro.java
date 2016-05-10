package com.davidkestering.cursojava.aula29;

/**
 * Created by seduc on 10/05/2016.
 */
public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro("Fiat","Ducato",10,100,0.2);

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}
