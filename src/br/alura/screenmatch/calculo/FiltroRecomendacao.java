package br.alura.screenmatch.calculo;

import br.alura.screenmatch.modelos.Title;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificao() >= 4) {

            System.out.println("está entre os preferidos do momento");
        }else if(classificavel.getClassificao() >= 2){
            System.out.println("è bem avaliado");
        }
        else{
            System.out.println("Para assistir depois");
        }
    }
}
