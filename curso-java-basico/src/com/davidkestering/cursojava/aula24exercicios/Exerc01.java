package com.davidkestering.cursojava.aula24exercicios;

/**
 * Created by seduc on 03/05/2016.
 */
public class Exerc01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = lampada.tipoLuz = "Amarelo";
        lampada.tipos = new String[2];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";

        System.out.println(lampada.modelo);
    }
}
