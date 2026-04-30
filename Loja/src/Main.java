//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Produto p1 = new Produto("a", "AA", 1.5, 3);
    Produto p2 = new Produto("b", "AAA", 2.5, 1);
    Produto p3 = new Produto("c", "AA", 3.5, 0);

        MateriaisDeConstrucao m1 = new MateriaisDeConstrucao();
        m1.adicionarProdutos(p1);
        m1.adicionarProdutos(p2);
        m1.adicionarProdutos(p3);

        PesquisaProdutoDTO V1 = new pesquisaProdutoDTO();

    }
}