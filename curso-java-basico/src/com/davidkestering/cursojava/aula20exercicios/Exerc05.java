package com.davidkestering.cursojava.aula20exercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by seduc on 25/04/2016.
 */
public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        int ultimoDiaMesAtual = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int qtdHoras = 8;
        int qtdMeses = 12;
        String[][][] matrizAgenda = new String[qtdMeses][ultimoDiaMesAtual][qtdHoras];
        int mes;
        int dia;
        int hora;
        boolean sair = false;

        for(int i=0;i<matrizAgenda.length;i++){
            for(int j=0;j<matrizAgenda[i].length;j++){
                for(int k=0;k<matrizAgenda[i][j].length;k++){
                    matrizAgenda[i][j][k] = "";
                }
            }
        }

        do {
            System.out.println("Voce deseja Consultar(1), Cadastrar(2), Sair(3)");
            int resp = scan.nextInt();
            switch (resp){
                case 1:
                    System.out.println("Informe o mes do ano:");
                    mes = scan.nextInt();
                    System.out.println("Informe o dia do mes:");
                    dia = scan.nextInt();
                    System.out.println("Informe a hora (0 ate 8):");
                    hora = scan.nextInt();
                    if(matrizAgenda[(mes-1)][(dia-1)][hora].length() >= 1) {
                        System.out.println("COMPROMISSO: " + matrizAgenda[(mes-1)][(dia-1)][hora]);
                        continue;
                    }else {
                        System.out.println("Não existe compromisso agendado.");
                        break;
                    }
                case 2:
                    System.out.println("Informe o mes do ano:");
                    mes = scan.nextInt();
                    System.out.println("Informe o dia do mes:");
                    dia = scan.nextInt();
                    System.out.println("Informe a hora (0 ate 8):");
                    hora = scan.nextInt();
                    System.out.println("Digite o texto do compromisso:");
                    matrizAgenda[(mes-1)][(dia-1)][hora] = scan.next();
                    if(matrizAgenda[(mes-1)][(dia-1)][hora].length() >= 1) {
                        System.out.println("Compromisso agendado com sucesso!");
                        continue;
                    }else {
                        System.out.println("Erro ao agendar tente novamente.");
                        break;
                    }
                case 3:
                    sair = true;
                    break;
            }

        }while(!sair);
    }
}
