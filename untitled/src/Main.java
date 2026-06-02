public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Canis lupus", 12.5, "Labrador");
        Gato gato = new Gato("Felino", 4.2, true);

        System.out.println("ANIMAIS CADASTRADOS");
        System.out.println(cachorro);
        System.out.println(gato);

        System.out.println("Espécie do cachorro: " + cachorro.getEspecie());
        System.out.println("Raça do cachorro: " + cachorro.getRaca());
        System.out.println("Peso do gato: " + gato.getPeso() + "kg");
        System.out.println("Gato castrado? " + gato.isCastrado());

        System.out.println("\n");
        cachorro.setPeso(13.0);
        cachorro.setRaca("Golden Retriever");
        System.out.println("Cachorro atualizado: " + cachorro);

        System.out.println("\nVALIDAÇÃO");
        gato.setPeso(-5);

        System.out.println("\nPOLIMORFISMO");
        Animal[] animais = { cachorro, gato };
        for (Animal a : animais) {
            System.out.println(a.getEspecie() + " faz: " + a.emitirSom());
        }
    }
}