package com.example.servicessystem.entidades;
import com.example.servicessystem.entidades.PrestadorDeServico;

public class Servico {
    private int id;
    private String nome;
    private String categoria;
    private double preco;
    private PrestadorDeServico[] prestadorServico;

    public Servico(int id, String nome, String categoria, double preco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;

    }

    public Servico(int id, String nome, String categoria, double preco, PrestadorDeServico[] prestadorServico) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.prestadorServico = prestadorServico;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public PrestadorDeServico[] getPrestadorServico() {
        return prestadorServico;
    }

    public void setPrestadorServico(PrestadorDeServico[] prestadorServico) {
        this.prestadorServico = prestadorServico;
    }


}

