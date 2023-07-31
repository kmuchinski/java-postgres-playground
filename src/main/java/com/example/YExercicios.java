package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class YExercicios {
    public static void main(String[] args) {
        int opcao;
        int nessimoNumero;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("Escolha as opções abaixo: ");
            System.out.println("[ 1 ] - Fibonacci simples");
            System.out.println("[ 2 ] - Fibonacci com Array");
            System.out.println("[ 3 ] - Fibonacci com Recursividade");
            System.out.println("[ 0 ] - Sair");
            opcao = scanner.nextInt();
            System.out.println("------------------------------------------------------");
            switch (opcao){
                case 1:
                    System.out.println("Informe o n-éssimo número: ");
                    nessimoNumero = scanner.nextInt();
                    Fibonacci fibonacci = new Fibonacci(nessimoNumero);
                    fibonacci.calcularFibonacciSimples();
                    break;
                case 2:
                    System.out.println("Informe o n-éssimo número: ");
                    nessimoNumero = scanner.nextInt();
                    Fibonacci fibonacciArray = new Fibonacci(nessimoNumero);
                    ArrayList<Integer> lista = new ArrayList<Integer>();
                    lista = fibonacciArray.calcularFibonacciArray();

                    for (int x = 0; x < nessimoNumero; x++){
                        System.out.print(lista.get(x) + " ");
                    }
                    break;
                case 3:
                    System.out.println("Informe o n-éssimo número: ");
                    nessimoNumero = scanner.nextInt();
                    Fibonacci fibonacciRecursivo = new Fibonacci(nessimoNumero);
                    for (int y = 0; y < nessimoNumero; y++) {
                        System.out.println(fibonacciRecursivo.calcularFibonacciRecursivo(y));
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
