package Set.Pesquisa;

public class Tarefas {

    private String descricao;
    private String status;
    private boolean estaConcluida;

    public Tarefas(String descricao, boolean estaConcluida) {
        this.descricao = descricao;
        this.estaConcluida = estaConcluida;
        this.status = estaConcluida == false ? "Pendente" : "Concluída";
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getEstaConcluida() {
        return estaConcluida;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEstaConcluida(boolean estaConcluida) {
        this.estaConcluida = estaConcluida;
    }

    @Override
    public String toString() {
        return "{" + descricao + ", " + status + "}";
    }
}
