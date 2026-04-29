public class Aluno {

private String nome;
private int idade;
private String matricula;
private String curso;
private double media;

    public void setNome(String nome) {
        if(nome.isBlank() || !nome.matches("^[a-zA-Z]+$")){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade<0 || idade> 100){
            throw new IllegalArgumentException("Idade invalida");
        }
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        if(matricula.length()>8){
            throw new IllegalArgumentException("Número de matricula invalido");
        }
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        if(curso.isBlank()){
            throw new IllegalArgumentException("O campo Curso não pode estar em branco");
        }
        this.curso = curso;
    }

    public void setMedia(double media) {
        if (media<0 || media>10){
            throw new IllegalArgumentException("A media não pode ser menor que 0");
        }
        this.media = media;
    }

    public Aluno(String nome, int idade, String matricula, String curso, double media) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setCurso(curso);
        setMedia(media);


    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", media=" + media +
                '}';
    }
}
