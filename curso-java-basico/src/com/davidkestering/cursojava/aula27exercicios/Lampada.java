package com.davidkestering.cursojava.aula27exercicios;

/**
 * Created by seduc on 09/05/2016.
 */
public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if(ligada)
            System.out.println("A lampada está ligada");
        else
            System.out.println("A lampada está desligada");
    }
}
