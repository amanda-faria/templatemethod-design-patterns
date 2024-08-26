package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AjudanteDeCozinhaTest {

    @Test
    void deveRetonarAprovado() {
        AjudanteDeCozinha candidato = new AjudanteDeCozinha();
        candidato.setProva(7.0f);
        candidato.setEntrevista(8.0f);
        assertEquals("Aprovado", candidato.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        AjudanteDeCozinha candidato = new AjudanteDeCozinha();
        candidato.setProva(5.3f);
        candidato.setEntrevista(4.2f);
        assertEquals("Reprovado", candidato.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AjudanteDeCozinha candidato = new AjudanteDeCozinha();
        candidato.setProva(5.3f);
        candidato.setEntrevista(4.9f);
        candidato.setNome("Joana");
        candidato.setNumIdentificacao(1);
        assertEquals("Candidato{Número de identificação=1, nome='Joana', resultado=Reprovado}", candidato.getInfo());
    }
}