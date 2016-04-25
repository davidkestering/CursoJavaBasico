package com.davidkestering.cursojava.aula20;

/**
 * Created by seduc on 25/04/2016.
 */
public class MatrizTridimensional {
    public static void main(String[] args) {
        int[][][] matrizTridimensional = new int[3][3][3];

        for(int i=0;i<matrizTridimensional.length;i++){
            for(int j=0;j<matrizTridimensional[i].length;j++){
                for(int k=0;k<matrizTridimensional[i][j].length;k++){
                    matrizTridimensional[i][j][k] = i+j+k;
                }
            }
        }

        for(int i=0;i<matrizTridimensional.length;i++){
            for(int j=0;j<matrizTridimensional[i].length;j++){
                for(int k=0;k<matrizTridimensional[i][j].length;k++){
                    System.out.print(matrizTridimensional[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int soma = 0;
        int somaPar = 0;
        int somaImpar = 0;
        for(int i=0;i<matrizTridimensional.length;i++){
            for(int j=0;j<matrizTridimensional[i].length;j++){
                for(int k=0;k<matrizTridimensional[i][j].length;k++){
                    soma += matrizTridimensional[i][j][k];
                    if(matrizTridimensional[i][j][k]%2==0)
                        somaPar+=matrizTridimensional[i][j][k];
                    else
                        somaImpar+=matrizTridimensional[i][j][k];
                }
            }
        }
        System.out.println("A soma total é "+soma);
        System.out.println("A soma dos pares é "+somaPar);
        System.out.println("A soma dos impares é "+somaImpar);

    }
}
