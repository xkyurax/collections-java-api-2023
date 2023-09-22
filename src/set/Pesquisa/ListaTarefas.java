package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefas> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean estaConcluida) {
        tarefasSet.add(new Tarefas(descricao, estaConcluida));
    }

    public void removerTarefa(String descricao) {
        Tarefas tarefaParaRemover = null;

        for(Tarefas t : tarefasSet) {
            if(t.getDescricao() == descricao) {
                tarefaParaRemover = t;
            }
        }
        tarefasSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println("Lista de tarefas: " + tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefas> obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for(Tarefas t : tarefasSet) {
            if(t.getEstaConcluida() == true) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes() {
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for(Tarefas t : tarefasSet) {
            if(t.getEstaConcluida() == false) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefas t : tarefasSet){
            if(t.getDescricao() == descricao) {
                t.setEstaConcluida(true);
                t.setStatus("Concluída");
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefas t : tarefasSet){
            if(t.getDescricao() == descricao) {
                t.setEstaConcluida(false);
                t.setStatus("Pendente");
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefasSet.removeAll(tarefasSet);
    }


    @Override
    public String toString() {
        return "ListaTarefas{" +
                "tarefasSet=" + tarefasSet +
                '}';
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1", false);
        listaTarefas.adicionarTarefa("Tarefa 2", true);
        listaTarefas.adicionarTarefa("Tarefa 3", false);
        listaTarefas.adicionarTarefa("Tarefa 4", true);
        listaTarefas.adicionarTarefa("Tarefa 5", false);

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 1");
        listaTarefas.exibirTarefas();


        System.out.println("Existem " + listaTarefas.contarTarefas() + " tarefas na lista.");
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaConcluida("Tarefa 3");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Tarefa 4");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
