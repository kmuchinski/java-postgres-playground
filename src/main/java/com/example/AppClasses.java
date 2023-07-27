package com.example;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente(-12321.92, 'M');

        //cliente.setRenda(-12000.10);
        //cliente.setSexo('M');
        cliente.setAnoNascimento(1991);

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo; " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("É especial: " + cliente.isEspecial());

    }
}
