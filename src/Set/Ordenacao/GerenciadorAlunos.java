package Set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno>  alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Set<Aluno> alunosParaRemover = new HashSet<>();
        for(Aluno a : alunosSet) {
            if(a.getMatricula() == matricula) {
                alunosParaRemover.add(a);
                break;
            }
        }
        alunosSet.removeAll(alunosParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }


    @Override
    public String toString() {
        return "[" + alunosSet + "]";
    }



    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 3", 03L, 4.0);
        gerenciadorAlunos.adicionarAluno("Aluno 1", 01L, 1.0);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 02L, 9.0);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("Alunos por nome: " + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por nota: " + gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(1L);

        System.out.println("Alunos por nota: " + gerenciadorAlunos.exibirAlunosPorNota());
    }
}
