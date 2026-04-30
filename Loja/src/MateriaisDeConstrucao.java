import java.util.ArrayList;
import java.util.List;

public class MateriaisDeConstrucao {

    private List<Produto> listaProdutos;

    public MateriaisDeConstrucao() {
        listaProdutos = new ArrayList<>();
    }

    public void adicionarProdutos(Produto p) {
        listaProdutos.add(p);
    }

    public List<Produto> obterListaTotaldeProdutos(){
        return listaProdutos;
    }

    List<Produto> obterListaProdutos(PesquisaProdutoDTO validacao){
        List<Produto> comprarProdutos = new ArrayList<>();
        for (Produto p : listaProdutos){
            if(p.getMarca().equals(validacao.getmarca()) && (p.getPreco() <= validacao.getPrecoFinal() && p.getPreco()>= validacao.getPrecoInicial())){
                comprarProdutos.add(p);
            }
        }
        return comprarProdutos;
    }


     public Produto obterProdutoCaro(){
         double maiorPreco = 0;
         Produto saida = null;
        for(Produto p : listaProdutos){
            if(p.getPreco() > maiorPreco){
                maiorPreco = p.getPreco() ;
                 saida = p;
            }
        }
        return saida;
    }
}
