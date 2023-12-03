package br.com.soundfy.minhasmusicas.principal;

import br.com.soundfy.minhasmusicas.modelos.Musica;
import br.com.soundfy.minhasmusicas.modelos.Podcast;
import br.com.soundfy.minhasmusicas.modelos.Recomendados;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        //para simular novos resultados, setar novo titulo, álbum, artista e gênero
        musica.setTitulo("Break My Soul");
        musica.setAlbum("Renaissance");
        musica.setArtista("Beyoncé");
        musica.setGenero("House Music");

        //simulador de reproduções e curtidas da música
        //para simular novos resultados de replays, likes e classificação, setar novo número máximo
        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        /*

        //simulador de classificação da música

        if (musica.getTotalCurtidas() <= 39){
            System.out.println("Música avaliada em 3 estrelas");
        } else if (musica.getTotalCurtidas() <= 49){
            System.out.println("Música avaliada em 4 estrelas");
        } else if (musica.getTotalCurtidas() >= 50){
            System.out.println("Música avaliada em 5 estrelas");
        }

         */

        String fichaMusica = """
                ******************************
                Música: %s
                Álbum: %s
                Artista: %s
                Gênero: %s
                ******************************""".formatted(musica.getTitulo(),musica.getAlbum(), musica.getArtista(),
                musica.getGenero());
        System.out.println(fichaMusica);

        Podcast podcast = new Podcast();
        //para simular novos resultados, setar novo titulo, host e descricao
        podcast.setTitulo("Bom dia, Obvious");
        podcast.setHost("Marcela Ceribelli");
        podcast.setDescricao("A vida é pra quem sabe fazer ao vivo");

        //simulador de reproduções e curtidas do podcast
        //para simular novos resultados de replays, likes e classificação, setar novo número máximo
        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        /*

        //simulador de classificação do podcast

        if (podcast.getTotalCurtidas() <= 399){
            System.out.println("Podcast avaliado em 3 estrelas");
        } else if (podcast.getTotalCurtidas() <= 499){
            System.out.println("Podcast avaliado em 4 estrelas");
        } else if (podcast.getTotalCurtidas() >= 500){
            System.out.println("Podcast avaliado em 5 estrelas");
        }

         */

        String fichaPodcast = """
                ******************************
                Título: %s
                Host: %s
                Descrição: %s
                ******************************""".formatted(podcast.getTitulo(),podcast.getHost(),podcast.getDescricao());
        System.out.println(fichaPodcast);

        Recomendados recomendados = new Recomendados();
        //para chamar o podcast ou musica e aplicar a lógica do método da classe Recomendados:
        recomendados.inclui(podcast);
        recomendados.inclui(musica);

    }
}
