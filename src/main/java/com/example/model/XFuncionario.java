package com.example.model;

import java.sql.Date;


public class XFuncionario {
    private Long id;
    private String nome;
    private String cpf;
    private int idLoja;
    private Date dataNascimento;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdLoja(){
        return this.idLoja;
    }

    public void setIdLoja(int idLoja){
        this.idLoja = idLoja;
    }

    public Date getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String toString(){
        return "Funcionário: " + nome + "Id: " + id + " CPF: " + cpf + "lojaId: " + idLoja + "DataNascimento" + dataNascimento;
    }
}
