package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private int anoNascimento;

    public void setRenda(double renda) {
        if(renda >= 0)
            this.renda = renda;
        else
            System.out.println("Renda deve ser maior que zero");
    }

    public double getRenda() {
        return this.renda;
    }

    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else
            System.out.println("Sexo deve ser M ou F");
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setAnoNascimento(int anoNascimento){
        if(anoNascimento >= 1900 && anoNascimento <= 2023)
            this.anoNascimento = anoNascimento;
        else
            System.out.println("Ano informado inválido...");
    }

    public int getAnoNascimento(){
        return this.anoNascimento;
    }
}
