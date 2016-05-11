package com.davidkestering.cursojava.aula36exercicios;

/**
 * Created by seduc on 11/05/2016.
 */
public class Agenda {
    private String nomeAgenda;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Nome Agenda: "+this.getNomeAgenda()+"\n";
        if(contatos != null){
            for(Contato c: contatos){
                info += c.obterInfo()+"\n";
            }
        }
        return info;
    }
}
