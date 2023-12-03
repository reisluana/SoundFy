package br.com.soundfy.minhasmusicas.modelos;


public class Podcast extends Audio {
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

    //atributo classificação (estendido da superclasse Audio) é usado para aplicar a lógica de avaliação do podcast
    @Override
    public int getClassificacao(){
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
