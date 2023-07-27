package com.example;

import java.util.Arrays;

public class AppArray {
    public static void main(String[] args) {
        int vetor[] = {10, 20, 30};
        
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
    }
}
