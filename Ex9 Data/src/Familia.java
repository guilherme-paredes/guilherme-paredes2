import java.util.ArrayList;
import java.util.List;

public class Familia {

    private List<Pessoa> listaPessoas;

    public Familia(){
        listaPessoas = new ArrayList<>();
    }

        void adicionarPessoa(Pessoa pessoa) {
            listaPessoas.add(pessoa);
        }

        Pessoa encontrarPessoaMaisVelha() {
            Pessoa maisVelha = listaPessoas.get(0);

            for (Pessoa p : listaPessoas) {
                if (p.getDataNascimento() .isBefore(maisVelha.getDataNascimento())) {
                    maisVelha = p;
                }
            }

            return maisVelha;
        }
    }
