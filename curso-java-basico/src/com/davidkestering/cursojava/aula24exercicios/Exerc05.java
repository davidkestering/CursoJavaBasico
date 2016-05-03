package com.davidkestering.cursojava.aula24exercicios;

/**
 * Created by seduc on 03/05/2016.
 */
public class Exerc05 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = "123456";
        contaCorrente.agencia = "1234";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500.00;
        contaCorrente.saldoConta = 10.00;

        System.out.println(contaCorrente.agencia);
        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldoConta);
    }
}
