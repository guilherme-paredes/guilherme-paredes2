public abstract class Animal {

    private String especie;
    private double peso;

    public Animal(String especie, double peso) {
        this.especie = especie;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            System.out.println("Peso inválido. Deve ser maior que zero.");
            return;
        }
        this.peso = peso;
    }

    public abstract String emitirSom();

    @Override
    public String toString() {
        return "Espécie: " + especie + " | Peso: " + peso + "kg | Som: " + emitirSom();
    }
}