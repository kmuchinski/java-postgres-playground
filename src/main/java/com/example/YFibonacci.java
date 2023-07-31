package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class YFibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<Integer>();
        System.out.println("Informe o n número de um fibonacci...");
        int nessimoTermo = scanner.nextInt();

        valores.add(0);
        valores.add(1);
        for (int i = 2; i < nessimoTermo; i++) {
            valores.add(valores.get(i-1) + valores.get(i -2));
        }

        for (int x = 0; x < nessimoTermo; x++){
            System.out.print(valores.get(x) + ", ");
        }
    }
}
