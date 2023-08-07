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
                var stm = conn.createStatement();
                var result = stm.executeQuery("select * from estado");
                while(result.next()){
                    System.out.println(result.getString("nome"));
                }
            } catch (Exception e) {
                System.out.println("Erro......");
            }
           
        } catch (ClassNotFoundException e) {
            System.out.println("Erro! " + e.getMessage());
        }
    }
}
