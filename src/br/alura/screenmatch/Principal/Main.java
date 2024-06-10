package br.alura.screenmatch.Principal;

import br.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.alura.screenmatch.calculo.FiltroRecomendacao;
import br.alura.screenmatch.modelos.Episodio;
import br.alura.screenmatch.modelos.Film;
import br.alura.screenmatch.modelos.Serie;

import br.alura.screenmatch.modelos.Title;

import java.util.ArrayList;

public  class Main {
    public static void main(String[] args) {
        Film starWars = new Film("StarWars","George Lucas", 1977, true );
        starWars.setDuracaoEmMinutos(160);
        starWars.setOscars(5);
        starWars.pegaMedia();

        starWars.avaliar(8);
        starWars.avaliar(10);
        starWars.getDuracaoEmMinutos();

        System.out.println(starWars.getOscars());
//filme dois
        Film savingFace = new Film("Saving Face", "Alice Wu", 2004, true);

        savingFace.setDuracaoEmMinutos(130);



        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        
        calculadora.inclui(starWars);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(savingFace);
        System.out.println(calculadora.getTempoTotal());

        Serie theLWorld = new Serie("The L World", "Mary Harron", 2004, true);
        theLWorld.setTemporadas(10);
        theLWorld.setAtiva(false);
        theLWorld.setMinutosPorEpisodio(30);
        theLWorld.setEpisodiosPorTemporada(23);

        System.out.println(theLWorld.getDuracaoEmMinutos());

        calculadora.inclui(theLWorld);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("\n");
        theLWorld.exebirInformacao();
        System.out.println("\n");
        starWars.exebirInformacao();

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(starWars);

        Episodio episodioLworld = new Episodio();
        episodioLworld.setNome("primeiro");
        episodioLworld.setNumero(1);
        episodioLworld.setSerie(theLWorld);
        episodioLworld.setTotalVisualizacoes(20000);

        filtro.filtra(episodioLworld);

        var mosnter = new Film("Monster", "", 2023, true);
        mosnter.setDuracaoEmMinutos(120);

        mosnter.avaliar(10);
        mosnter.exebirInformacao();

    }
}