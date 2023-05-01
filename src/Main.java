import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Top Gun Maverick");
        filme.setAnoDeLancamento(2022);
        filme.setDuracaoEmMinutos(180);

        filme.exibirFichaTecnica();
        filme.avaliar(8);
        filme.avaliar(5);
        filme.avaliar(10);

        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());

        System.out.println(filme.retornarMedia());

        Serie serie = new Serie();

        serie.setNome("Breaking Bad");
        serie.setAnoDeLancamento(2008);
        serie.setTemporadas(8);
        serie.setEpisodiosPorTemporada(10);

        serie.exibirFichaTecnica();
        System.out.println(serie.getTemporadas());
        System.out.println(serie.getEpisodiosPorTemporada());
    }
}
