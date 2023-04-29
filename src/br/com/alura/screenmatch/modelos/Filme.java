package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public void exibirFilme() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos do filme: " + duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double retornarMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
