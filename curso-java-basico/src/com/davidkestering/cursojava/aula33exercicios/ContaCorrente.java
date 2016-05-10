package com.davidkestering.cursojava.aula33exercicios;

/**
 * Created by seduc on 10/05/2016.
 */
public class ContaCorrente {
    private String numero;
    private String agencia;
    private boolean especial;
    private double saldoConta;
    private double limiteEspecial;
    private double valorEspecialUsado;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial, double saldoConta, double limiteEspecial, double valorEspecialUsado) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.saldoConta = saldoConta;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public boolean realizarSaque(double valor){
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

    public void depositarDinheiro(double valor){
        saldoConta += valor;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: "+saldoConta);
    }

    public boolean verificarUsoChequeEspecial(){
        if(saldoConta>=0)
            return false;
        else
            return true;
    }



}
