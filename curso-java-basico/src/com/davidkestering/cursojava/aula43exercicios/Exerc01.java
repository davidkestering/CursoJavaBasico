package com.davidkestering.cursojava.aula43exercicios;

/**
 * Created by davidkestering on 14/05/16.
 */
public class Exerc01 {
    public static void main(String[] args) {
        System.out.println("*** Teste Conta Bancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("David Kestering");
        contaSimples.setNumConta("123456");

        System.out.println(contaSimples.depositar(100));
        System.out.println(contaSimples.sacar(50));
        System.out.println(contaSimples.sacar(70));

        System.out.println(contaSimples);
        System.out.println();

        System.out.println("*** Teste Conta Poupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("David Kestering");
        contaPoupanca.setNumConta("123456");

        System.out.println(contaPoupanca.depositar(100));
        System.out.println(contaPoupanca.sacar(50));
        contaPoupanca.setDiaRendimento(14);
        System.out.println("Novo saldo com rendimento: "+contaPoupanca.calcularNovoSaldo(0.3));
        System.out.println(contaPoupanca.sacar(70));

        System.out.println(contaPoupanca);
        System.out.println();

        System.out.println("*** Teste Conta Limite ***");

        ContaEspecial contaLimite = new ContaEspecial();
        contaLimite.setNomeCliente("David Kestering");
        contaLimite.setNumConta("123456");
        contaLimite.setLimite(500);

        System.out.println(contaLimite.depositar(100));
        System.out.println(contaLimite.sacar(50));
        System.out.println(contaLimite.sacar(70));

        System.out.println(contaLimite);
        System.out.println();


    }
}
