package com.example;

import java.util.Arrays;

public class AppArray {
    public static void main(String[] args) {
        int vetor[] = {10, 20, 30};

        System.out.println("----------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 100 * (i+1);
            
        }
        System.out.println("----------------------------------");
        
        System.out.println("Valor da Posição 0: " + vetor[0]);
        System.out.println("Valor da Posição 1: " + vetor[1]);
        System.out.println("Valor da Posição 2: " + vetor[2]);

        vetor[1] = 60;

        System.out.println("Valor da Posição1: " + vetor[1]);

        double matriz[][] = {{10, 20, 30},{40, 50, 60}};
        //Alteração de Matriz
        matriz[0][1] = 100;
        //Alterar a linha inteira
        matriz[1] = new double[]{11, 34, 45};
        //Impressão de Matriz
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

        System.out.println("--------------***--------------------");

        double matriz2[][] = new double[2][3];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = i * matriz2[i].length + j+1;
            }
        }
        //Imprimir a matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.printf("%5.1f ",matriz2[i][j]);
            }
            System.err.println();
        }
    }
}
