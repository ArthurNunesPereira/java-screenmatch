package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme = new Filme("Top Gun Maverick", 2022);
        filme.avaliar(8);
        Filme filme2 = new Filme("Titanic", 2009);
        filme2.avaliar(1);
        Filme filme3 = new Filme("Jojo Rabbit", 2019);
        filme3.avaliar(10);
        Serie serie = new Serie("Breaking Bad", 2008);
        serie.avaliar(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme3);
        lista.add(filme);
        lista.add(filme2);
        lista.add(serie);

        for (Titulo item : lista) {
            if (item instanceof Filme meuFilme && meuFilme.getClassificacao() > 2) {
                System.out.println(item.getNome());
                System.out.println("Classificação: " + filme.getClassificacao());
            } else if (!(item instanceof Filme)) {
                System.out.println("Série: " + item.getNome());
            }
        }
    }
}
