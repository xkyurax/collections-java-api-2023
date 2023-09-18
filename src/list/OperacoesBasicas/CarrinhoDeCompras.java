package list.OperacoesBasicas;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Item> carrinhoLista;

    public CarrinhoDeCompras() {
        this.carrinhoLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoLista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        ArrayList<Item> itemsParaRemover = new ArrayList<>();

        for(Item i : carrinhoLista){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        carrinhoLista.removeAll(itemsParaRemover);
    }

    public void calcularValorTotal() {

        double total = 0;
        for(Item i : carrinhoLista){
            total += i.getPreco();
        }
        System.out.println("O valor total é de: " + total);
    }

    public void exibirItems() {
        System.out.println(carrinhoLista);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Item 1", 20.0, 2);
        carrinho.adicionarItem("Item 2", 10.0, 3);
        carrinho.exibirItems();

//        carrinho.removerItem("Item 1");
//        carrinho.exibirItems();

        carrinho.calcularValorTotal();
    }
}
