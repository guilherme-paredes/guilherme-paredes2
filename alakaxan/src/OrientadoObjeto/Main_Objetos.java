package OrientadoObjeto;

public class Main_Objetos {

	public static void main(String[] args) {
		
		Objeto produto1 = new Objeto();
		produto1.nome = "Caderno";
		produto1.descricao = "Caderno em espiral tamanho médio";
		produto1.precoUnitario = 4.5;
		produto1.desconto = 15;
		
		Objeto produto2 = new Objeto();
		produto2.nome = "Caneta ESF";
		produto2.descricao = "Caneta esferográfica 5mm";
		produto2.precoUnitario = 1.20;
		produto2.desconto = 2;
		
		Objeto produto3 = new Objeto();
		produto3.nome = "Esquadro";
		produto3.descricao = "Esquadro de acrílico 20 cm";
		produto3.precoUnitario = 2.35;
		produto3.desconto = 10;
	}

}
