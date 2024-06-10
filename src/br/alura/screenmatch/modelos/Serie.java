package br.alura.screenmatch.modelos;

public class Serie extends Title{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, String diretor, int anoLancamento, boolean incluidoNoPlano) {
        super(nome, diretor, anoLancamento, incluidoNoPlano);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
       return (minutosPorEpisodio * temporadas * episodiosPorTemporada);
    }
    @Override
    public String toString(){
        return "Serie: " + this.getNome() + "( "+ this.getAnoLancamento() + " )";
    };
}
