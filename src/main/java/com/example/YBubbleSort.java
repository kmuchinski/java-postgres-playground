package com.example;

import java.util.Vector;

public class YBubbleSort {
    public static void main(String[] args){
        int vetor[] = {3, 6, 2, 1, 8, 4, 100, 112, 120};
        int aux;
        Boolean controle;
        for(int i=0; i < vetor.length; i++){
            controle = true;
            for(int j=0; j < (vetor.length-1); j++){
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    controle = false;
                }
            }
            if(controle)
                break;
        }
        for (int k = 0; k<vetor.length; k++) {
            System.out.print(vetor[k] + ", ");
        }
    }
}
