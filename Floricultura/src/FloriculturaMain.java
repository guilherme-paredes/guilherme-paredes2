public class FloriculturaMain {
    public static void main(String[] args) {
        Flor f1 = new Flor("Cannabis", 12.5, "Jeff");
        Flor f2 = new Flor("Margarida", 10.8,"Maria" );
        Flor f3 = new Flor("Tulipa", 25, "De frango");
        Flor f4 = new Flor("Cannabis 2", 40.20, "Jeff");

        Floricultura itajai = new Floricultura();
        itajai.adicionarFlor(f1);
        itajai.adicionarFlor(f2);
        itajai.adicionarFlor(f3);
        itajai.adicionarFlor(f4);
        itajai.adicionarFlor(new Flor("arvore",30,"Jeff"));



System.out.println(itajai.obterListaCompradores("Jeff"));
    }
}
