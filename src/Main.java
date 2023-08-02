import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
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
        serie.setMinutosPorEpisodio(50);

        serie.exibirFichaTecnica();
        System.out.println(serie.getTemporadas());
        System.out.println(serie.getEpisodiosPorTemporada());
        System.out.println("Duração em minutos para maratonar Breaking Bad: " + serie.getDuracaoEmMinutos());

        Filme filme2 = new Filme();

        filme2.setNome("Titanic");
        filme2.setAnoDeLancamento(2009);
        filme2.setDuracaoEmMinutos(160);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.incluirTitulo(filme);
        calculadora.incluirTitulo(filme2);
        calculadora.incluirTitulo(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);
    }
}
