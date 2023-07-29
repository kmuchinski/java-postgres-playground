package com.example;

import java.util.Scanner;

public class YPalindromo {
    public static void main(String[] args) {
        String palavra;
        String palavraInversa = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma palavra: ");
        palavra = scanner.nextLine().toUpperCase();
        for (int i = palavra.length()-1; i >= 0; i--) {
            palavraInversa = palavraInversa + palavra.charAt(i);
        }
        if (palavra.equals(palavraInversa)){
            System.out.println("é um Palíndromo!!!");
        }
        else{
            System.out.println("A palavra " + palavra + " não é um Palíndromo....");
        }
    }
}
