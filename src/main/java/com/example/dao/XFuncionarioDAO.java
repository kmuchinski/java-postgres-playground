package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.example.model.XFuncionario;

public class XFuncionarioDAO extends XDAO {
    public XFuncionarioDAO(Connection conn){
        super(conn);
    }

    public List<XFuncionario> listar() throws SQLException {
        var lista = new LinkedList<XFuncionario>();
        var statement = conn.createStatement();
        var result = statement.executeQuery("select * from funcionario");
        while(result.next()){
            var funcionario = new XFuncionario();
            funcionario.setId(result.getLong("id"));
            funcionario.setNome(result.getString("nome"));
            funcionario.setCpf(result.getString("cpf"));
            funcionario.setIdLoja(result.getInt("loja_id"));
            funcionario.setDataNascimento(result.getDate("data_nascimento"));
            lista.add(funcionario);
        }
        return lista;
    }
}
