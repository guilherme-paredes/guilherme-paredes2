import java.time.LocalDate;

public class Pessoa {

        private String nome;
        private LocalDate dataNascimento;

        Pessoa(String nome, LocalDate dataNascimento) {
            setNome(nome);
            setDataNascimento(dataNascimento);
        }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
            if (nome.isBlank()){
                throw new IllegalArgumentException("Nome não pode ser vazio");
            }
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data invalida");
        }
            this.dataNascimento = dataNascimento;
    }
}


