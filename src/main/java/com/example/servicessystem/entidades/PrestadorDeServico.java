package com.example.servicessystem.entidades;

public class PrestadorDeServico extends Pessoa{
    private Servico servico;

    public PrestadorDeServico(String nome, String cpf, String endereco, String telefone, Servico servico)  {
        super(nome, cpf, endereco, telefone);
        this.servico = servico;
    }
    public PrestadorDeServico(String nome, String cpf, String endereco, String telefone)  {
        super(nome, cpf, endereco, telefone);

    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
