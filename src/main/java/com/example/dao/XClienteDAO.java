package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.example.model.XCliente;

public class XClienteDAO extends DAO {
    public XClienteDAO(Connection conn){
        super(conn);
    }
    public List<XCliente> listar() throws SQLException{
        var lista = new LinkedList<XCliente>();
        var statement = conn.createStatement();
        var sql = "select * from cliente";
        var result = statement.executeQuery(sql);
        while(result.next()){
            var cliente = new XCliente();
            cliente.setId(result.getLong("id"));
            cliente.setNome(result.getString("nome"));
            cliente.setCpf(result.getString("cpf"));
            cliente.setIdCidade(result.getInt("cidade_id"));
            cliente.setDataNascimento(result.getDate("data_nascimento"));
            lista.add(cliente);
        }
        return lista;
    }

    public void localizar(Long id){
        var sql = "select *  from cliente where id = ?";
        try(var statement = conn.prepareStatement(sql)) {
            statement.setLong(1, id);
            var result = statement.executeQuery();
            if(result.next())
                System.out.printf("Cliente Localizado: %s -- CPF: %s -- Cidade: %d -- Data de Nascimento: %s", result.getString("nome"), result.getString("cpf"), result.getInt("cidade_id"), result.getDate("data_nascimento"));
        } catch (Exception e) {
            System.err.println("Erro ao localizar o cliente: " + e.getMessage());
        }
    }

    public void inserir(XCliente client){
        var sql = "insert into cliente (nome, cpf, cidade_id, data_nascimento) values(?, ?, ?, ?)";
        try(var statement = conn.prepareStatement(sql)) {
            statement.setString(1, client.getNome());
            statement.setString(2, client.getCpf());
            statement.setInt(3, client.getIdCidade());
            statement.setDate(4, client.getDataNascimento());
            if (statement.executeUpdate() == 1)
                System.out.println("Cliente " + client.getNome() + " inserido com Sucesso!!!");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir o cliente no banco: " + e.getMessage());
        }
    }

    public void alterarNome(XCliente client){
        var sql = "update cliente set nome = ? where id = ?";
        try(var statemente = conn.prepareStatement(sql)) {
            statemente.setString(1, client.getNome());
            statemente.setLong(2, client.getId());
            if(statemente.executeUpdate() == 1)
                System.out.println("Cliente: " + client.getNome() + " alterado com Sucesso!!!");
        } catch (Exception e) {
            System.err.println("Erro ao alterar o nome do cliente: " + e.getMessage());
        }
    }

    public void excluir(Long id){
        var sql = "delete from cliente where id = ?";
        try(var statement = conn.prepareStatement(sql)) {
            statement.setLong(1, id);
            if(statement.executeUpdate() == 1)
                System.out.println("Cliente execluído com sucesso!!!");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir o cliente: " + e.getMessage());
        }
    }
}
