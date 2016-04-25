package com.davidkestering.cursojava.aula18;

import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class BreakeContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Informe dois numeros.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for(int i=num1;i<=num2;i++){
            if(i%7==0) {
                System.out.println("O valor é " + i);
                break;
            }

        }*/

        /*for(int i=0;i<=4;i++){
            rotulo1:{
                rotulo2:{
                    rotulo3:{
                        if(i==1) break rotulo1;
                        if(i==2) break rotulo2;
                        if(i==3) break rotulo3;
                        System.out.println("Rotulo 3");
                    }
                    System.out.println("Rotulo 2");
                }
                System.out.println("Rotulo 1");
            }
            System.out.println("i: "+i);
        }*/

        System.out.println("Informe dois numeros.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for(int i=num1;i<=num2;i++){
            if(i%7==0) {
                continue;
            }
            System.out.println("O valor é " + i);
        }

    }
}
