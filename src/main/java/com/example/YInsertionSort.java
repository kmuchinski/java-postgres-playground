package com.example;

public class YInsertionSort {
    public static void main(String[] args) {
        int vetor[] = {3, 6, 2, 1, 8, 4, 100, 112, 120};

        int aux;
        int j;
        for (int i= 1; i < vetor.length; i++){
            aux=vetor[i];
            j = i-1;
            while(j >=0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
