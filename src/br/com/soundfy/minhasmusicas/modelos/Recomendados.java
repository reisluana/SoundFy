package br.com.soundfy.minhasmusicas.modelos;

public class Recomendados {
    //o método da classe Recomendados aplica a lógica com base na classificação de cada tipo de Audio (ou seja, as músicas e os filmes)
    //para apresentar os áudios que são tendência e são incluídos na lista de Recomendação
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é tendência no momento!");
        } else {
            System.out.println(audio.getTitulo() + " para ouvir mais tarde");
        }
    }
}
