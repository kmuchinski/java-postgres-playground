package com.example;

import java.util.ArrayList;

public class Fibonacci {
    private int nessimo;

    public Fibonacci(int nessimo){
        this.nessimo = nessimo;
    }

    public void calcularFibonacciSimples(){
        int a = 0;
        int b = 1;
        int aux;

        for (int i = 0; i < this.nessimo; i++){
            System.out.println(a);
            aux = a;
            a = a + b;
            b = aux;
        }
    }

    public ArrayList<Integer> calcularFibonacciArray(){
        ArrayList<Integer> valores = new ArrayList<Integer>();

        valores.add(0);
        valores.add(1);
        for (int i = 2; i < this.nessimo; i++) {
            valores.add(valores.get(i-1) + valores.get(i -2));
        }

        return valores;
    }

    public int calcularFibonacciRecursivo(int num){
        if (num < 2){
            return 1;
        }
        return calcularFibonacciRecursivo(num - 1) + calcularFibonacciRecursivo(num - 2);
    }
}
