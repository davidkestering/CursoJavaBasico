package com.davidkestering.cursojava.aula43exercicios;

/**
 * Created by seduc on 17/05/2016.
 */
public class Contribuinte {
    private boolean tipoPessoaPF;
    private String nome;

    public Contribuinte() {
    }

    public Contribuinte(boolean tipoPessoaPF, String nome) {
        this.tipoPessoaPF = tipoPessoaPF;
        this.nome = nome;
    }

    public boolean isTipoPessoaPF() {
        return tipoPessoaPF;
    }

    public void setTipoPessoaPF(boolean tipoPessoaPF) {
        this.tipoPessoaPF = tipoPessoaPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calculaImposto(double valor){
        double total=0;
        double porcAlicota=0;
        int parcDeduzir=0;
        if(tipoPessoaPF){
            if(valor >= 3600.01){
                porcAlicota = 0.30;
                parcDeduzir = 700;
            }else if(valor >= 2800.01 && valor < 3600.01){
                porcAlicota = 0.25;
                parcDeduzir = 500;
            }else if(valor >= 2100.01 && valor < 2800.01){
                porcAlicota = 0.15;
                parcDeduzir = 270;
            }else if(valor >= 1400.01 && valor < 2100.01){
                porcAlicota = 0.10;
                parcDeduzir = 100;
            }
            total = (valor*porcAlicota)-parcDeduzir;
        }else {
            total = (valor*0.1);
        }
        return total;
    }

}
