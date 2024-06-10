package br.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{

        @SerializedName("Title")
        private String nome;
        private String diretor;
        @SerializedName("Year")
        private int anoLancamento;
        private boolean incluidoNoPlano;
        private double somaAvaliacao;
        private int totalAvaliacao;
        private int duracaoEmMinutos;

    public Title(String nome, String diretor, int anoLancamento, boolean incluidoNoPlano) {
        this.nome = nome;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    //Getters = recuperar valores do atributo
        public int getTotalAvaliacao(){
            return totalAvaliacao;
        }
//Getters
    public String getDiretor() {
        return diretor;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaAvaliacao() {
        return  somaAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    //setters = incluir valor no atributo


        public void setNome(java.lang.String nome) {
            this.nome = nome;
        }
        public void setDiretor(String diretor){
            this.diretor = diretor;
        }
        public void  setAnoLancamento(int anoLancamento){

                this.anoLancamento = anoLancamento;

        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos){
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void  setIncluidoNoPlano(boolean incluidoNoPlano){
            this.incluidoNoPlano = incluidoNoPlano;
        }


        //    Metodos
        public void exebirInformacao(){
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de Lancamento: " + anoLancamento);
            System.out.println("Total de Avaliacoes: " +totalAvaliacao);
        }

        public void avaliar(double nota){
            somaAvaliacao+= nota;
            totalAvaliacao += 1;
        }

        public int pegaMedia(){
            return (int) (somaAvaliacao / totalAvaliacao);
        }


    @Override
    public int compareTo(Title outroTitulo) {
        System.out.println(this.getNome());
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Title{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}

