package map.Pesquisa;

public class Palavra {
    private String palavra;
    private Integer contagem;

    public Palavra(String palavra, Integer contagem) {
        this.palavra = palavra;
        this.contagem = contagem;
    }

    public String getPalavra() {
        return palavra;
    }

    public Integer getContagem() {
        return contagem;
    }
}
