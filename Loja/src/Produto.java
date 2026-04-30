public class Produto {
    private String marca;
    private String modelo;
    private double preco;
    private int qtd;

    public Produto(String marca, String modelo, double preco, int qtd) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQtd(qtd);
    }

    public void setMarca(String marca) {
        if (marca.isBlank()){
            throw new IllegalArgumentException("Campo marca não pode estar vazio");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo.isBlank()){
            throw new IllegalArgumentException("Campo modelo não pode estar vazio");
        }
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        if (preco<0){
            throw new IllegalArgumentException("O preço não pode ser menor que 0");
        }
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        if (qtd<0){
            throw new IllegalArgumentException("A quantidade não pode ser menor que 0");
        }
        this.qtd = qtd;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }
}
