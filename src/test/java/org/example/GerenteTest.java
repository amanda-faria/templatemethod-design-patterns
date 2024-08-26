package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveRetonarAprovado() {
        Gerente candidato = new Gerente();
        candidato.setProva(9.0f);
        candidato.setEntrevista(7.0f);
        assertEquals("Aprovado", candidato.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        Gerente candidato = new Gerente();
        candidato.setProva(7.0f);
        candidato.setEntrevista(6.9f);
        assertEquals("Reprovado", candidato.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        Gerente candidato = new Gerente();
        candidato.setProva(7.0f);
        candidato.setEntrevista(7.0f);
        candidato.setNome("Maria");
        candidato.setNumIdentificacao(3);
        assertEquals("CargoGerente{Número de identificação=3, nome='Maria', resultado=Reprovado}", candidato.getInfo());
    }
}