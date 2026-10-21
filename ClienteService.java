package Algoritmos.Java.Desafio1.Classes.Mais.CRUD;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClienteService {

    private Map<Integer, Cliente> clientes = new LinkedHashMap<>();
    private int ID=1;

    public Cliente cadastrar(String nome, String email){
        Cliente cliente = new Cliente(ID, nome, email);
        for (Cliente antigos : clientes.values()){
            if (antigos.getEmail().equals(email)){
                return null;
            }
        }
        clientes.put(ID, cliente);
        ID++;
        return cliente;
    }

    public List<Cliente> listar(){
        List<Cliente> listaCompleta = new ArrayList<>();

        //Adicionar clientes na lista.
        for (Cliente antigos : clientes.values()){
            Cliente novo = new Cliente(antigos.getId(), antigos.getNome(), antigos.getEmail());
            listaCompleta.add(novo);
        }
        return listaCompleta;
    }

    public Cliente buscarPorId(int id){
        if (clientes.containsKey(id)){
            return clientes.get(id);
        }
        return null;
    }

    public boolean atualizarEmail(int id, String novoEmail){
        if (clientes.containsKey(id)){
            Cliente atual = clientes.get(id);
            atual.setEmail(novoEmail);
            return true;
        }
        return false;
    }

    public boolean removerCliente(int id){
        if (!clientes.containsKey(id)){
            return false;
        }
        clientes.remove(id);
        return true;
    }
}

