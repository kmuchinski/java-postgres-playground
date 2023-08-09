package com.example.model;

import java.sql.Date;

public class XCliente {
    private Long id;
    private String nome;
    private String cpf;
    private int idCidade;
    private Date dataNascimento;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString(){
        return "Cliente: " + nome + " ID: " + id + " CPF: " + cpf + " id Cidade: " + idCidade + " Data Nascimento: " + dataNascimento;
    }
}
