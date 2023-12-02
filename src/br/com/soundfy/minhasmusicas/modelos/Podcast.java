package br.com.soundfy.minhasmusicas.modelos;

import br.com.soundfy.minhasmusicas.avaliacao.Recomendavel;

public class Podcast extends Audio implements Recomendavel {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getRecomendacao() {
        return 0;
    }
}
