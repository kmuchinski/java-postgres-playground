package com.example;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente();

        cliente.setRenda(12000.10);
        cliente.setSexo('M');
        cliente.setAnoNascimento(2024);

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo; " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());

    }
}
