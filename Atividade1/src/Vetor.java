import java.util.ArrayList;
import java.util.List;

public class Vetor {
    private int tamanho;
    private List<Aluno> alunos;

    public Vetor() {
        this.tamanho = 0;
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        this.tamanho++;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
            System.out.println("Prova: " + aluno.getProva() + "; " + "Trabalho: " + aluno.getTrabalho()+"; "+ "Projeto: " + aluno.getProjeto());
            System.out.println();
        }
    }

    public void buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println(aluno.getNome()+"\nProva: " + aluno.getProva() +"; " + "Trabalho: " + aluno.getTrabalho()+"; "+"Projeto: " + aluno.getProjeto());
            }
        }
    }

    public void removerAluno(String nome) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                alunoParaRemover = aluno;
                break;
            }
        }
        if (alunoParaRemover != null) {
            alunos.remove(alunoParaRemover);
        }
    }


}
