package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jackie");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        System.out.println("Lista de titulos ordenada alfabeticamente:");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de titulos ordenada por ano de lançamento:");
        System.out.println(lista);
    }
}
