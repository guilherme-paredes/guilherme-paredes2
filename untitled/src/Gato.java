public class Gato extends Animal {

    private boolean castrado;

    public Gato(String especie, double peso, boolean castrado) {
        super(especie, peso);
        this.castrado = castrado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public String toString() {
        return super.toString() + " | Castrado: " + (castrado ? "Sim" : "Não");
    }
}