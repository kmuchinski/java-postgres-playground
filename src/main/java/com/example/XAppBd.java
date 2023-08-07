package com.example;

import java.sql.SQLException;

import com.example.dao.XConnectionManager;
import com.example.dao.XDAO;
import com.example.dao.XFuncionarioDAO;
import com.example.model.XFuncionario;


public class XAppBd {
    public static void main(String[] args) {
        new XAppBd();
    }

    public XAppBd(){
        try(var conn = XConnectionManager.getConnection()){
            var funcionarioDAO = new XFuncionarioDAO(conn);
            var listaFuncionario = funcionarioDAO.listar();
            for (var func : listaFuncionario) {
                System.out.println(func);
            }
        } catch (SQLException e){
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }
}
