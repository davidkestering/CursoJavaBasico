package com.davidkestering.cursojava.aula27exercicios;

/**
 * Created by seduc on 09/05/2016.
 */
public class Exerc02 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = "123456";
        contaCorrente.agencia = "1234";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500.00;
        contaCorrente.valorEspecialUsado = 0;
        contaCorrente.saldoConta = 10.00;

        System.out.println(contaCorrente.agencia);
        System.out.println(contaCorrente.numero);
        contaCorrente.consultarSaldo();

        contaCorrente.depositarDinheiro(500);
        contaCorrente.consultarSaldo();

        boolean saqueEfetuado = contaCorrente.realizarSaque(510);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            contaCorrente.consultarSaldo();
            if(contaCorrente.verificarUsoChequeEspecial())
                System.out.println("Está usando cheque especial");
            else
                System.out.println("Não está usando cheque especial");
        }else
            System.out.println("Nao foi possivel realizar o saque");
    }
}
