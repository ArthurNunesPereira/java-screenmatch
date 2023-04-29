public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibirFilme() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos do filme: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double retornarMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
