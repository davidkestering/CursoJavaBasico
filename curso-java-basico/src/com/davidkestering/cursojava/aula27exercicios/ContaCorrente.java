package com.davidkestering.cursojava.aula27exercicios;

/**
 * Created by seduc on 09/05/2016.
 */
public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double saldoConta;
    double limiteEspecial;
    double valorEspecialUsado;

    boolean realizarSaque(double valor){
        if(saldoConta >= valor) {
            saldoConta -= valor;
            return true;
        } else{
            if(especial){
                double limite = limiteEspecial+saldoConta;
                if(limite>=valor){
                    saldoConta-=valor;
                    return true;
                }else
                    return false;
            }else
                return false;
        }
    }

    void depositarDinheiro(double valor){
        saldoConta += valor;
    }

    void consultarSaldo(){
        System.out.println("Seu saldo é: "+saldoConta);
    }

    boolean verificarUsoChequeEspecial(){
        if(saldoConta>=0)
            return false;
        else
            return true;
    }

}
