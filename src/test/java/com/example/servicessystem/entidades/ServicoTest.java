package com.example.servicessystem.entidades;

import static org.junit.jupiter.api.Assertions.*;

import com.example.servicessystem.exceptions.ListaPrestadoresVaziaException;
import com.example.servicessystem.exceptions.PrecoInvalidoException;
import org.junit.Test;

public class ServicoTest {

    @Test
    public void testCriacaoServico() {
        PrestadorDeServico[] prestadores = new PrestadorDeServico[1];
        prestadores[0] = new PrestadorDeServico();

        Servico servico = new Servico(1, "Wendell", "Tester", 5000, prestadores);

        assertNotNull(servico);
        assertEquals(1, servico.getId());
        assertEquals("Wendell", servico.getNome());
        assertEquals("Tester", servico.getCategoria());
        assertEquals(5000, servico.getPreco(), 0.001);
        assertArrayEquals(prestadores, servico.getPrestadorServico());
    }

    @Test(expected = PrecoInvalidoException.class)
    public void testPrecoInvalido() {
        PrestadorDeServico[] prestadores = new PrestadorDeServico[1];
        prestadores[0] = new PrestadorDeServico();//esperar prestador

        //criando preço negativo
        Servico servico = new Servico(1, "Wendell", "Tester", -5000, prestadores);
    }

    @Test(expected = ListaPrestadoresVaziaException.class)
    public void testListaPrestadoresVazia() {
        Servico servico = new Servico(1, "Wendell", "Tester", 5000, null);
    }

    @Test
    public void testAtualizacaoServico() {
        PrestadorDeServico[] prestadores = new PrestadorDeServico[1];
        prestadores[0] = new PrestadorDeServico(/* fornecer argumentos do construtor */);

        Servico servico = new Servico(1, "Wendell", "Tester", 5000, prestadores);

        //atualizando dados
        servico.setNome("Novo Nome");
        servico.setCategoria("Nova Categoria");
        servico.setPreco(6000);

        assertEquals("Novo Nome", servico.getNome());
        assertEquals("Nova Categoria", servico.getCategoria());
        assertEquals(6000, servico.getPreco(), 0.001);
    }

    @Test
    public void testListaPrestadoresNaoVazia() {
        PrestadorDeServico[] prestadores = new PrestadorDeServico[1];
        prestadores[0] = new PrestadorDeServico();//esperar os argumentos do prestador

        Servico servico = new Servico(1, "Wendell", "Tester", 5000, prestadores);


        assertNotNull(servico.getPrestadorServico());
        assertTrue(servico.getPrestadorServico().length > 0);
    }
}