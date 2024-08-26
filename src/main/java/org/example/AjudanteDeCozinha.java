package org.example;

public class AjudanteDeCozinha extends Candidato {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}