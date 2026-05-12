import java.time.LocalDate;

        public class Main {
            public static void main(String[] args) {
                Familia familia = new Familia();

                familia.adicionarPessoa(new Pessoa("Ana", LocalDate.of(1990, 5, 10)));
                familia.adicionarPessoa(new Pessoa("Carlos", LocalDate.of(1965, 3, 22)));
                familia.adicionarPessoa(new Pessoa("Beatriz", LocalDate.of(1980, 8, 15)));

                Pessoa maisVelha = familia.encontrarPessoaMaisVelha();
                System.out.println("Pessoa mais velha: " + maisVelha.getNome());
            }
        }
