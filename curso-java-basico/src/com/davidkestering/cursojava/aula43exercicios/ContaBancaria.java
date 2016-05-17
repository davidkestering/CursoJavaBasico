package com.davidkestering.cursojava.aula43exercicios;


/**
 * Created by davidkestering on 14/05/16.
 */
public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String sacar(double valor){
        String msg="";
        if(this.saldo>0){
            if(this.saldo-valor>0){
                this.saldo -= valor;
                msg = "Saque realizado com sucesso, seu saldo eh "+this.saldo+".";
            }else{
                msg = "Seu saldo é de "+this.saldo+". Insuficiente para o saque de "+valor;
            }
        }else {
            msg = "Nao ha saldo para realizar o saque.";
        }
        return msg;
    }

    public String depositar(double valor){
        String msg="";
        if(valor>0){
            this.saldo += valor;
            msg = "Deposito realizado com sucesso. Seu novo saldo é de "+this.saldo;
        }else{
            msg = "Nao eh possivel depositar valores abaixo de zero.";
        }
        return msg;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
