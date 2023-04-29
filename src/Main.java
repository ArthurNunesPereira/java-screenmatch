public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.nome = "Top Gun Maverick";
        filme.anoDeLancamento = 2022;
        filme.duracaoEmMinutos = 180;

        filme.exibirFilme();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());

        System.out.println(filme.retornarMedia());
    }
}
