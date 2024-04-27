package com.example.servicessystem.entidades;

public class TesteGeral {
    public static void main(String[] args) {

        SistemaPrestacaoServico sistema = new SistemaPrestacaoServico(2, 2, 2);

        Cliente cliente1 = new Cliente("João", "123456789","Rua A, 123", "(81)987227812" );
        Cliente cliente2 = new Cliente("Maria", "987654321", "Rua B, 456","(71)999852741" );
        sistema.adicionarCliente(cliente1, 0);
        sistema.adicionarCliente(cliente2, 1);

        //adicionando prestadores de serviço
        PrestadorDeServico prestador1 = new PrestadorDeServico("Pedro", "54785544","Rua tal, 22", "987556221");
        PrestadorDeServico prestador2 = new PrestadorDeServico("Ana", "48641561","Avenida ufrpe,2022", "985464741");
        sistema.adicionarPrestadorServico(prestador1, 0);
        sistema.adicionarPrestadorServico(prestador2, 1);

        Servico servico0 = new Servico(1, "Conserto de Vazamento", "Encanamento", 100.0);
        Servico servico1 = new Servico(2,"Conserto de Vazamento", "Reparo em tubulações", -100);
        Servico servico2 = new Servico(3,"Instalação Elétrica", "Montagem de circuitos", 150);
        sistema.adicionarServico(servico1, 0);
        sistema.adicionarServico(servico2, 1);

        //exibindo informações
        System.out.println("Clientes:");
        for (Cliente cliente : sistema.getClientes()) {
            System.out.println("Nome: " + cliente.getNome() + ", Endereço: " + cliente.getEndereco() + ", Telefone: " + cliente.getTelefone());
        }

        System.out.println("\nPrestadores de Serviço:");
        for (PrestadorDeServico prestador : sistema.getPrestadorServico()) {
            System.out.println("Nome: " + prestador.getNome() + ", Especialidade: " + ", Experiência: ");
        }

        System.out.println("\nServiços:");
        for (Servico servico : sistema.getServicos()) {
            System.out.println("Nome: " + servico.getNome() + ", Preço: R$" + servico.getPreco());
        }
    }
}
