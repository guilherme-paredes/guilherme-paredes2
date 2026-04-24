import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<Flor> listaFlor;

    public Floricultura() { listaFlor = new ArrayList<>();}

    public void adicionarFlor(Flor a){listaFlor.add(a);}

    public List<Flor> obterListaFlor() {
        return listaFlor;
        }

        List<Flor> obterListaDeFlores(String nome){
        List<Flor> sexo2 =  new ArrayList<>();
        for(Flor f : listaFlor){
            if(f.getNome().equals(nome)){
                
            }
        }
        }



}
