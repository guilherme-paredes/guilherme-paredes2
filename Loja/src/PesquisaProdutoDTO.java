public class PesquisaProdutoDTO {
    private String marca;
    private double precoInicial;
    private double precoFinal;

    public PesquisaProdutoDTO(String marca, double preco, double precoFinal) {
       setmarca(marca);
       setPrecoInicial(precoInicial);
       setPrecoFinal(precoFinal);
    }

    public void setmarca(String marca) {
        if (marca.isBlank()){
            throw new IllegalArgumentException("Campo Marca não pode ser vazio.");
        }
        this.marca = marca;
    }

    public void setPrecoInicial(double preco) {
        if(preco < 0 ) {
            throw new IllegalArgumentException("Preço não pode ser menor que 0");
        }
        this.precoInicial = preco;
    }

    public void setPrecoFinal(double precoFinal) {
        if (precoFinal<= precoInicial){
            throw new IllegalArgumentException("O preço final não pode ser menor que preco");
        }
        this.precoFinal = precoFinal;
    }

    public double getPrecoInicial() {
        return precoInicial;
    }

    public String getmarca() {
        return marca;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }
}

