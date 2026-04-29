//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Pedro", 18, "12345678", "matematica", 5.5);
        Aluno a2 = new Aluno("Alan", 21, "87654321", "eletronica", 6.3 );
        Aluno a3 = new Aluno("Joao", 22, "11111111", "projetos", 2.8 );
        Aluno a4 = new Aluno("Maria", 20, "22222222", "matematica", 7.5 );
        Aluno a5 = new Aluno("Larissa", 19, "33333333", "eletronica", 3.7 );
        Aluno a6 = new Aluno("Joana", 25, "44444444", "projetos", 5.5 );
        Aluno a7 = new Aluno("Henrique", 28, "55555555", "artes", 9.8 );

        PesquisaAlunoDTO V1 = new PesquisaAlunoDTO("matematica",18, 6.5);

        SistemaAlunos senai = new SistemaAlunos();
        senai.adicionarAluno(a1);
        senai.adicionarAluno(a2);
        senai.adicionarAluno(a3);
        senai.adicionarAluno(a4);
        senai.adicionarAluno(a5);
        senai.adicionarAluno(a6);
        senai.adicionarAluno(a7);

        System.out.println(senai.obterListaAlunos(V1));

    }
}