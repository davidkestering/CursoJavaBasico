package com.davidkestering.cursojava.aula52exercicios;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by seduc on 23/05/2016.
 */
public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 1;

        while (opcao != 3){
            opcao = obterOpcaoMenu(scan);
            if(opcao == 1){ //consultar contato
                consultarContato(scan,agenda);
            }else if(opcao == 2){//adicionar contato
                adicionarContato(scan,agenda);
            }
        }


        if(opcao == 3){// sair
            System.exit(0);
        }

    }

    public static void adicionarContato(Scanner scan, Agenda agenda){
        try {
            System.out.println("Criando um contato, entre com as informações.");
            String nome = lerInformacaoString(scan,"Entre com o nome do contato.");
            String telefone = lerInformacaoString(scan,"Entre com o telefone do contato.");
            String email = lerInformacaoString(scan,"Entre com o email do contato.");
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);
            System.out.println("Contato a ser criado: "+contato);
            agenda.adicionarContato(contato);
        }catch (AgendaCheiaException exc){
            System.out.println(exc.getMessage());
            System.out.println("Contatos da Agenda: \n"+agenda);
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda){
        String nomeContato = lerInformacaoString(scan,"Entre com o nome do contato a ser pesquisado.");
        try {
            if(agenda.consultarContatoPorNome(nomeContato)>=0){
                System.out.println("Contato Existe.");
            }
        }catch (ContatoNaoExisteException exc){
            //Logger.getLogger(Teste.class.getName()).log(Level.SEVERE,null,exc);
            System.out.println(exc.getMessage());
        }
    }

    public static String lerInformacaoString(Scanner scan,String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan){
        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar Contato");
            System.out.println("2: Adicionar Contato");
            System.out.println("3: Sair");

            try{
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                if(opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida=true;
                }else {
                    throw new Exception("Entrada Invalida");
                }
            }catch (Exception e){
                System.out.println("Entrada invalida. Digite novamente.");
            }
        }

        return opcao;
    }

}
