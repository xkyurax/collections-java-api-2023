package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {

    private List<Numero> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente() {
        List<Numero> ordenadoAscendente = new ArrayList<>(numeroList);
        Collections.sort(ordenadoAscendente);

        return ordenadoAscendente;
    }

    public List<Numero> ordenarDescendente() {
        List<Numero> ordenadoDescendente = new ArrayList<>(numeroList);
        Collections.sort(ordenadoDescendente, new ComparatorDescendente());

        return ordenadoDescendente;
    }

    @Override
    public String toString() {
        return "" + numeroList + "";
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);

        System.out.println(ordenacaoNumeros);

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
