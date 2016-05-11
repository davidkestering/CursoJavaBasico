package com.davidkestering.cursojava.aula36exercicios;

import java.util.Scanner;

/**
 * Created by seduc on 11/05/2016.
 */
public class Exerc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("Informe o nome da Agenda");
        agenda.setNomeAgenda(scan.nextLine());

        Contato[] contatos = new Contato[3];
        for(int i=0;i<contatos.length;i++){
            System.out.println("Informe os dados do contato "+(i+1));
            Contato c = new Contato();
            System.out.println("Informe o nome");
            c.setNome(scan.nextLine());
            System.out.println("Informe o telefone");
            c.setTelefone(scan.nextLine());
            System.out.println("Informe o email");
            c.setEmail(scan.nextLine());
            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if(agenda != null)
            System.out.println(agenda.obterInfo());
    }
}
