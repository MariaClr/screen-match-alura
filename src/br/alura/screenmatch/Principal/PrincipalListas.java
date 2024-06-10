package br.alura.screenmatch.Principal;

import br.alura.screenmatch.modelos.Film;
import br.alura.screenmatch.modelos.Serie;
import br.alura.screenmatch.modelos.Title;

import java.util.*;

public class PrincipalListas {
    public static void main(String[] args) {
        Film starWars = new Film("StarWars","George Lucas", 1977, true );
        Film savingFace = new Film("Saving Face", "Alice Wu", 2004, true);
        var mosnter = new Film("Monster", "", 2023, true);
        Serie theLWorld = new Serie("The L World", "Mary Harron", 2004, true);

        List<Title> lista = new LinkedList<>();
        lista.add(mosnter);
        lista.add(savingFace);
        lista.add(starWars);
        lista.add(theLWorld);

        for(Title elemento: lista){
            if(elemento instanceof Film){
                Film filme =  (Film) elemento;
                System.out.println(filme.getNome() + " " + filme.getClassificao());
        }};
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Kristen Stewart");
        buscaPorArtista.add("River phenix");
        buscaPorArtista.add("Emma Stone");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

//        Nao consigo ordenar lista pois ela é tipo title e nao possui um sort implementadode nela como em outros classes como String possui
        Collections.sort(lista);
        System.out.println(lista);
//        nova forma de comparar algo mais atualizado diferente do comppareble
        lista.sort(Comparator.comparing(Title::getAnoLancamento));

        System.out.println(lista);




    }
}
