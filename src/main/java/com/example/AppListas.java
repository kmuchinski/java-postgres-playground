package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppListas {
    public static void main(String[] args){
        List<Cliente> listaClientes = new ArrayList<>();
        //Adicionar na lista
        var cliente1 = new Cliente();
        cliente1.setNome("Kleisson");
        cliente1.setCpf("072.667.219-03");

        var cliente2 = new Cliente();
        cliente2.setNome("Muchinski");
        cliente2.setCpf("075.667.219-09");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.remove(0);
        //remover o ultimo elmento da lista
        int i = listaClientes.size() - 1;
        listaClientes.remove(i);
        for (var cliente : listaClientes) {
            System.out.println(cliente);
        }
    }
}
