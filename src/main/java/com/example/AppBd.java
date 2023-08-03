package com.example;

import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.dao.DAO;
import com.example.dao.EstadoDAO;
import com.example.dao.ProdutoDAO;
import com.example.model.Marca;
import com.example.model.Produto;

public class AppBd {
    public static void main(String[] args) {
        new AppBd();
    }

    public AppBd(){
        try(var conn = ConnectionManager.getConnection()){
            var estadoDAO = new EstadoDAO(conn);
            var listaEstado = estadoDAO.listar();
            for (var estado : listaEstado) {
                System.out.println(estado);
            }
            estadoDAO.localizar("PR");
            
            var marca = new Marca();
            marca.setId(2L);

            var produto = new Produto();
            produto.setId(206L);
            produto.setMarca(marca);
            produto.setNome("Produto teste alterado");
            produto.setValor(120);
            
            var produtoDAO = new ProdutoDAO(conn);
            //produtoDAO.inserir(produto);
            produtoDAO.alterar(produto);
            produtoDAO.excluir(203L);

            var dao = new DAO(conn);
            //dao.listar("produto");

        } catch (SQLException e) {
                System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
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
