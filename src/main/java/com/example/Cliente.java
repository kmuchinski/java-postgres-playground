package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

    public Cliente(){
        System.out.println("Criando um Cliente sem parâmetro...");
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            this.especial = true;
    }

    public Cliente(double renda, char sexo){
        this();//Por padrão quando tem mais de um método é recomentado que um chame o outra para faciliar a manutenção. 
        //Deve ficar na primeira linha.
        System.out.println("Criando um Cliente com parâmentro...");
        this.setRenda(renda);
        this.sexo = sexo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

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
