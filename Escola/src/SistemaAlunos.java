import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

    private List<Aluno> listaAlunos;

    public SistemaAlunos() {
        listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno a) {
        listaAlunos.add(a);
    }

    public List<Aluno> obterListaTotalAlunos() {
        return listaAlunos;
    }

    List<Aluno> obterListaAlunos(PesquisaAlunoDTO validacao) {
        List<Aluno> compararAlunos = new ArrayList<>();
            for (Aluno a : listaAlunos) {
                if (a.getIdade() >= validacao.getvIdade() && a.getMedia() >= validacao.getvMedia()) {
                    compararAlunos.add(a);
                }
            }
            return compararAlunos;
    }
}

