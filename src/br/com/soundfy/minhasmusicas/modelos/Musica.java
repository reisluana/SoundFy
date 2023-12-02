package br.com.soundfy.minhasmusicas.modelos;

import br.com.soundfy.minhasmusicas.avaliacao.Recomendavel;

public class Musica extends Audio implements Recomendavel {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getRecomendacao() {
        return 0;
    }
}
