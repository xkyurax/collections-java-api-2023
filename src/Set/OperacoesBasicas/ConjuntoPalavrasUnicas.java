package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavrasParaRemover = null;
        for(Palavra p : palavraSet) {
            if(p.getPalavra() == palavra){
                palavrasParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavrasParaRemover);
    }

    public void verificarPalavra(String palavra) {
        for(Palavra p : palavraSet) {
            if(p.getPalavra() == palavra) {
                System.out.println("A palavra " + p.getPalavra() + " está presente no conjunto.");
                break;
            }
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavraSet=" + palavraSet +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 5");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 3");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.verificarPalavra("Palavra 3");
    }
}
