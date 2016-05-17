package com.davidkestering.cursojava.aula43exercicios;


/**
 * Created by davidkestering on 14/05/16.
 */
public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String sacar(double valor){
        String msg="";
        double valorAux=0;
        double valorDimSaldo=0;
        if((this.limite+this.getSaldo())>0){
            if(this.getSaldo()-valor<0){
                msg += "O saque eh maior que seu saldo, vc estrará no limite da conta especial no valor de "+this
                        .getLimite()+".\n";
                valorAux = valor-this.getSaldo();
                valorDimSaldo = this.getSaldo();
                this.setSaldo(valorDimSaldo-this.getSaldo());
                this.setLimite(this.getLimite()-valorAux);
                msg += "Seu saldo agora é "+this.getSaldo()+".\nSeu limite agora é "+this.getLimite();
            }else{
                this.setSaldo(this.getSaldo()-valor);
                msg = "O saque foi realizado com sucesso e vc nao entrou no limite da conta especial\nSeu saldo atual eh de "+this.getSaldo()+", Seu limite eh de "+this.limite;
            }
        }else{
            msg = "Nao ha limite para realizar o saque";
        }
        return msg;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaEspecial{" +
                "limite=" + limite +
                "} ";
    }
}
