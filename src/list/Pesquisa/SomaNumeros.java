package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int total = 0;
        for(Integer i : listaNumeros){
            total += i;
        }

        return total;
    }

    public void encontrarMaiorNumero() {
        int valorMaximo = Integer.MIN_VALUE;
        for(Integer i : listaNumeros) {
            if(i > valorMaximo){
                valorMaximo = i;
            }
        }
        System.out.println("O maior número da lista é: " + valorMaximo);
    }

    public void encontrarMenorNumero() {
        int valorMinimo = Integer.MAX_VALUE;
        for(Integer i : listaNumeros) {
            if(i < valorMinimo) {
                valorMinimo = i;
            }
        }
        System.out.println("O maior número da lista é: " + valorMinimo);
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros.toString());
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(2);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.calcularSoma());


        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
    }
}
