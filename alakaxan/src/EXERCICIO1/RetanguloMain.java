package EXERCICIO1;

public class RetanguloMain {

	public static void main(String[] args) {
		Retangulo a1 = new Retangulo(2,2);
		Retangulo a2 = new Retangulo(4,4);
		Retangulo a3 = new Retangulo(6,6);
		
		EditaRetangulo m1 = new EditaRetangulo();
		
		m1.AdicionarRetangulo(a1);
		m1.AdicionarRetangulo(a2);
		m1.AdicionarRetangulo(a3);
		
		System.out.println("O retangulo com a maior área é: " + m1.obterRetanguloMaiorArea());
		System.out.println("O retangulo com a maior perimetro é: " + m1.obterRetanguloMaiorPerimetro());
	}

}
