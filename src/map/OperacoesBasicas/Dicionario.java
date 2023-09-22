package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraEncontrada = null;
        if(!dicionarioMap.isEmpty()) {
            palavraEncontrada = dicionarioMap.get(palavra);
        }
        return palavraEncontrada;
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Fusca", "Carro");
        dicionario.adicionarPalavra("Revolver", "Arma");
        dicionario.adicionarPalavra("Cozinha", "Cômodo");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Revolver");

        dicionario.exibirPalavras();

        System.out.println("A definição da sua palavra é: " + dicionario.pesquisarPorPalavra("Fusca"));

    }
}
