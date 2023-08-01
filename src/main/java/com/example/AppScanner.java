package com.example;

import java.util.Scanner;

import com.example.model.Cliente;

public class AppScanner {
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Informe um nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.println("Informe o Ano de Nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe o CPF: ");
        cliente.setCpf(scanner.nextLine());
        System.out.println("Informe a renda: ");
        cliente.setRenda(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Informe o sexo: ");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

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

    }
}
