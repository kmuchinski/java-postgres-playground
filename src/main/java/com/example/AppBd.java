package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.dao.EstadoDAO;
import com.example.model.Marca;
import com.example.model.Produto;

public class AppBd {
    public static void main(String[] args) {
        new AppBd();
    }

    public AppBd(){
        try(var conn = ConnectionManager.getConnection()){
            var estadoDAO = new EstadoDAO(conn);
            estadoDAO.listar();
            estadoDAO.localizar("PR");
            
            var marca = new Marca();
            marca.setId(2L);

            var produto = new Produto();
            produto.setId(206L);
            produto.setMarca(marca);
            produto.setNome("Produto teste alterado");
            produto.setValor(120);
            //inserirProduto(conn, produto);
            alterarProduto(conn, produto);
            excluirProduto(conn, 203L);
            listarDadosTabela(conn, "produto");

        } catch (SQLException e) {
                System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }

   private void excluirProduto(Connection conn, long id) {
        var sql = "delete from produto where id = ?";
        try {
            var statement = conn.prepareStatement(sql);
            statement.setLong(1, id);
            if(statement.executeUpdate() == 1)
                System.out.println("Produto excluído com Sucesso!");
            else 
                System.out.println("Erro ao Excluir o produto");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir o produto: " + e.getMessage());
        };
    }

    private void inserirProduto(Connection conn, Produto produto) {
        var sql = "insert into produto (nome, marca_id, valor) values (?, ?, ?)";
        try (var statement = conn.prepareStatement(sql)){
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro na inserção do produto: " + e.getMessage());
        }
    }

    private void alterarProduto(Connection conn, Produto produto) {
        var sql = "update produto set nome = ?, marca_id = ?, valor = ? where id = ?";
        try (var statement = conn.prepareStatement(sql)){
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.setLong(4, produto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro na alteração do produto: " + e.getMessage());
        }
    }

private void listarDadosTabela(Connection conn, String tabela) {
        var sql = "select * from " + tabela;
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);
            
            var metadata= result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i <= cols; i++) {
                System.out.printf("%-25s | ", metadata.getColumnName(i));
            }
            System.out.println();

            while(result.next()){
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-25s | ", result.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Erro na execução da cosulta." + e.getMessage());
        }
    }

   /*  private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao Banco de Dados." + e.getMessage());
        }
    }*/
}
