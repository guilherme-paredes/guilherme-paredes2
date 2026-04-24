public class Flor {
    private String flor;
    private double valor;
    private String nome;

    public void setFlor(String flor) {
        if (flor.isBlank()){
            throw new IllegalArgumentException("O tipo de flor não pode estar em branco.");
        }
        this.flor = flor;
    }

    public void setValor(Double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }
        this.valor = valor;
    }

    public void setNome(String nome) {
        if (nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode estar em branco.");
        }
        this.nome = nome;
    }

    public Flor(String flor, double valor, String nome) {
        setFlor(flor);
        setValor(valor);
        setNome(nome);
    }

    public String getFlor() {
        return flor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Flor{" + "flor='" + flor + '\'' + ", valor=" + valor + ", nome='" + nome + '\'' + '}';
    }
}
