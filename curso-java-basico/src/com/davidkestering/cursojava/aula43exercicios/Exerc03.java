package com.davidkestering.cursojava.aula43exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Exerc03 {
    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(1.50);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2.0);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarao");
        tubarao.setComprimento(3.00);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canada");
        urso.setComprimento(1.80);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        System.out.println(camelo.toString());
        System.out.println(tubarao.toString());
        System.out.println(urso.toString());

    }
}
