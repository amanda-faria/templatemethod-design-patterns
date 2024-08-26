package org.example;

public abstract class Candidato {

    private int numIdentificacao;
    protected String nome;
    private float prova;
    private float entrevista;

    public int getnumIdentificacao() {
        return numIdentificacao;
    }

    public void setNumIdentificacao(int numIdentificacao) {
        this.numIdentificacao = numIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getProva() {
        return prova;
    }

    public void setProva(float prova) {
        this.prova = prova;
    }

    public float getEntrevista() {
        return entrevista;
    }

    public void setEntrevista(float entrevista) {
        this.entrevista = entrevista;
    }

    public float calcularMedia() {
        return (this.prova + this.entrevista) / 2;
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Candidato";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "Número de identificação=" + this.numIdentificacao +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }
}