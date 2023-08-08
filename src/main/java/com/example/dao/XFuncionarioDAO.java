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

    public void localizar(Long cod){
        try{
            var sql = "select * from funcionario where id = ?";
            var statement = conn.prepareStatement(sql);
            statement.setLong(1, cod);
            var result = statement.executeQuery();
            if (result.next())
                System.out.printf("id: %d - nome: %s", result.getLong("id"), result.getString("nome"));
        } catch (SQLException e){
            System.err.println("Erro ao executar a consulta: " + e.getMessage());
        }
    }

    public void inserir(XFuncionario func){
        var sql = "insert into funcionario (nome, cpf, loja_id, data_nascimento) values (?, ?, ?, ?)";
        try(var statement = conn.prepareStatement(sql)) {
            statement.setString(1, func.getNome());
            statement.setString(2, func.getCpf());
            statement.setInt(3, func.getIdLoja());
            statement.setDate(4, func.getDataNascimento());
            if (statement.executeUpdate() == 1)
                System.out.println("Funcionário inserido com Sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro na Inserção do Produto: " + e.getMessage());
        }
    }

    public void excluir(long id){
        var sql = "delete from funcionario where id = ?";
        try (var statement = conn.prepareStatement(sql)) {
            statement.setLong(1, id);
            if (statement.executeUpdate() == 1)
                System.out.println("Funcionário excluído com Sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir o produto: " + e.getMessage());
        }
    }

    public void alterarLoja(XFuncionario func){
        var sql = "update funcionario set loja_id = ? where id = ?";
        try (var statement = conn.prepareStatement(sql)) {
            statement.setInt(1, func.getIdLoja());
            statement.setLong(2, func.getId());
            if (statement.executeUpdate() == 1)
                System.out.println("Alterado a Loja do Funcionário com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao alterar a Loja do funcionário: " + e.getMessage());
        }
    }
}
