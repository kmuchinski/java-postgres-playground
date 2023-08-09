package com.example;

import java.sql.Date;
import java.sql.SQLException;

import com.example.dao.XConnectionManager;
import com.example.dao.XFuncionarioDAO;
import com.example.dao.XClienteDAO;
import com.example.model.XCliente;
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
            System.out.println("************ CLIENTES **************");
            var clienteDAO = new XClienteDAO(conn);
            var listaCliente = clienteDAO.listar();
            for (var client: listaCliente){
                System.out.println(client);
            }
            System.out.println();
            clienteDAO.localizar(101L);
            System.out.println();
            var client = new XCliente();
            client.setId(101L);
            client.setNome("Kleisson Muchcccccccccxx");
            client.setCpf("07155722004");
            client.setIdCidade(3060);
            String dataString2 = "1991-10-19";
            Date dataNascimento2 = Date.valueOf(dataString2);
            client.setDataNascimento(dataNascimento2);
            //clienteDAO.inserir(client);
            //clienteDAO.alterarNome(client);
            System.out.println();
            //clienteDAO.excluir(101L);
        } catch (SQLException e){
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }
}
