import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<Flor> listaFlor;

    public Floricultura() {
        listaFlor = new ArrayList<>();
    } //Lista primaria

    public void adicionarFlor(Flor a) {
        listaFlor.add(a);
    } //adiciona um novo objeto a lista primaria

    public List<Flor> obterListaFlor() {
        return listaFlor;
    } //Mostra a lista Primaria

    List<Flor> obterListaCompradores(String nome) {
        List<Flor> compradorDeFlores = new ArrayList<>();
        for (Flor f : listaFlor) {
            if (f.getNome().equals(nome)) {
                compradorDeFlores.add(f);
            }
        }
        return compradorDeFlores ;
    }
}





