package Teste.Algoritmos;

import Algoritmos.Java.Desafio1.Classes.Mais.CRUD.Cliente;
import Algoritmos.Java.Desafio1.Classes.Mais.CRUD.ClienteService;

public class TestCrud {
    static void main(String[] args) {
        ClienteService service = new ClienteService();

        service.cadastrar("Ana", "ana@email.com");
        service.cadastrar("Bruno", "bruno@email.com");
        service.cadastrar("Carla", "carla@email.com");

        System.out.println(service.cadastrar("Outra Ana", "ana@email.com"));

        System.out.println(service.listar());

        System.out.println(service.buscarPorId(2));
        System.out.println(service.buscarPorId(9));

        System.out.println(service.atualizarEmail(2, "bruno@novo.com"));
        System.out.println(service.atualizarEmail(9, "x@x.com"));

        System.out.println(service.removerCliente(1));
        System.out.println(service.removerCliente(1));

        System.out.println(service.listar());

        System.out.println(service.cadastrar("Diego", "diego@email.com"));
    }
}
