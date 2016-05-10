package com.davidkestering.cursojava.aula33exercicios;

/**
 * Created by seduc on 10/05/2016.
 */
public class Exerc02 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumero("123456");
        contaCorrente.setAgencia("1234");
        contaCorrente.setEspecial(true);
        contaCorrente.setLimiteEspecial(500);
        contaCorrente.setSaldoConta(-10);

        System.out.println(contaCorrente.getNumero());
        System.out.println(contaCorrente.getAgencia());
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
