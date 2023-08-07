package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppTstBd {
    public static void main(String[] args) {
        System.out.println("-------- Aplicação Java -------------");
        listarEstados();
    }

    public static void listarEstados(){
        try {
            Class.forName("org.postgresql.Driver");
            try(var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "")){
                var cpf = "07266721961";
                var sql = "insert into funcionario (nome, cpf, loja_id, data_nascimento) values ('Kleisson x. Muchinski', ?, 6, '1991-09-19')";
                var statement = conn.prepareStatement(sql);
                statement.setString(1, cpf);
                statement.executeQuery();
            } catch (Exception e) {
                System.out.println("Erro......" + e.getMessage());
            }
           
        } catch (ClassNotFoundException e) {
            System.out.println("Erro! " + e.getMessage());
        }
    }
}
