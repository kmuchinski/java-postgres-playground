package com.example;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
            funcionarioDAO.localizar(40L);
            var func = new XFuncionario();
            func.setId(59L);
            func.setNome("Kreyson Muka");
            func.setCpf("07166822022");
            func.setIdLoja(12);
            String dataString = "1990-08-22";
            // Convertendo String para Date
            Date dataNascimento = Date.valueOf(dataString);
            func.setDataNascimento(dataNascimento);
            System.out.println();
            //funcionarioDAO.inserir(func);
            //funcionarioDAO.excluir(58);
            funcionarioDAO.alterarLoja(func);
        } catch (SQLException e){
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }
}
