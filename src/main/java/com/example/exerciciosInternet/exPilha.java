package com.example.exerciciosInternet;

import java.util.Stack;

public class exPilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("honda");
        pilha.push("Fiat");
        pilha.push("Hyundai");

        System.out.println(pilha.peek());

        var pilhaConsulta = pilha.pop();
        System.out.println("retorno: " + pilhaConsulta);
        
    }
}
