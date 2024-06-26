package com.example.servicessystem.entidades;

public class SistemaPrestacaoServico {
    private Cliente[] clientes;
    private PrestadorDeServico[] prestadorServico;
    private Servico[] servicos;

    public SistemaPrestacaoServico(Cliente[] clientes, PrestadorDeServico[] prestadorServicos, Servico[] servico) {
        this.clientes = clientes;
        this.prestadorServico = prestadorServicos;
        this.servicos = servico;
    }

    public SistemaPrestacaoServico(int tamanhoClientes, int tamanhoPrestadores, int tamanhoServicos) {
        clientes = new Cliente[tamanhoClientes];
        prestadorServico = new PrestadorDeServico[tamanhoPrestadores];
        servicos = new Servico[tamanhoServicos];
    }

    public void adicionarCliente(Cliente cliente, int index) {
        clientes[index] = cliente;
    }

    public void adicionarPrestadorServico(PrestadorDeServico prestador, int index) {
        prestadorServico[index] = prestador;
    }

    public void adicionarServico(Servico servico, int index) {
        servicos[index] = servico;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public PrestadorDeServico[] getPrestadorServico() {
        return prestadorServico;
    }

    public void setPrestadorServico(PrestadorDeServico[] prestadorServico) {
        this.prestadorServico = prestadorServico;
    }

    public Servico[] getServicos() {
        return servicos;
    }

    public void setServicos(Servico[] servicos) {
        this.servicos = servicos;
    }
}
