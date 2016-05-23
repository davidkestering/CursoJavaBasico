package com.davidkestering.cursojava.aula56exercicios;

/**
 * Created by seduc on 23/05/2016.
 */
public class Calculadora {
    enum Operacao{
        SOMAR('+') {
            @Override
            public double executarOperacao(double x, double y) {
                return x+y;
            }
        }, SUBTRAIR('-') {
            @Override
            public double executarOperacao(double x, double y) {
                return x-y;
            }
        }, MULTIPLICAR('*') {
            @Override
            public double executarOperacao(double x, double y) {
                return x*y;
            }
        }, DIVIDIR('/') {
            @Override
            public double executarOperacao(double x, double y) {
                return x/y;
            }
        };

        private char simbolo;

        Operacao(char simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);

        @Override
        public String toString() {
            return simbolo+"";
        }
    }

    public static void main(String[] args) {
        double x = 2.0, y = 3.0;

        for (Operacao op : Operacao.values()){
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(op.executarOperacao(x,y));
        }
    }
}
