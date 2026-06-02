public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String especie, double peso, String raca) {
        super(especie, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Au au!";
    }

    @Override
    public String toString() {
        return super.toString() + " | Raça: " + raca;
    }
}