package br.alura.screenmatch.calculo;

import br.alura.screenmatch.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public String getTempoTotal(){
        return ( "Tempo total em minutos: " + tempoTotal);
    }

//    como vamos receber um parametro que é uma classe de filme colocamos o tipo Film se fosse uma string qualquer colocariamos String
//    vai dar problema se voce pegar uma serie e colocar ai voce precisaria criar o mesmo metodo so passando o parametro do tipo serie
//    nao é recomendado entao voce precisa criar o metodo e passar como parametro a classe principal que engloba todas as outras classes o TITLE
//    public void inclui(Film filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }

    public void inclui(Title title){
        this.tempoTotal += title.getDuracaoEmMinutos();
    }
}
