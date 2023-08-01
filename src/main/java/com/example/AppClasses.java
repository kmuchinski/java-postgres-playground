package com.example;

import java.util.Scanner;

import com.example.model.Cliente;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando classes");

        Cliente cliente = new Cliente(12321.92, 'M');

        cliente.setAnoNascimento(1991);
        cliente.setNome("Kleisson Muchinski");
        cliente.setCpf("072.667.219-03");

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo; " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("É especial: " + cliente.isEspecial());
        System.out.println("Nome cliente: " +  cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        
        if(cliente.getCpf().equalsIgnoreCase(cliente.getNome())){//IngnoraCase desconsidera se está maiúscula ou minúscula
            System.out.println("CPF é igual...");
        }
        else{
            System.out.println("CPF é diferente....");
        }

        String[] vetorNome = cliente.getNome().split(" ");
        System.out.println("Nome: " + vetorNome[0]);
        System.out.println("Sobrenome: " + vetorNome[1]);
        System.out.println("Primeira letra: " + cliente.getNome().charAt(0));
    }
}
