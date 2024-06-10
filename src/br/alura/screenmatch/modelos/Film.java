package br.alura.screenmatch.modelos;

import br.alura.screenmatch.calculo.Classificavel;

public class Film extends Title implements Classificavel {
    private int oscars;

    public Film(String nome, String diretor, int anoLancamento, boolean incluidoNoPlano) {
        super(nome, diretor, anoLancamento, incluidoNoPlano);
    }

    public  int getOscars(){
        return oscars;
    }

    public void setOscars(int oscars) {
        this.oscars = oscars;
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia()/2;
    }
    @Override
    public String toString(){
        return "Filme: " + this.getNome() + "( " + this.getAnoLancamento() +" )";
    }
}
