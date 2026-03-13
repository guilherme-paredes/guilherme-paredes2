package OrientadoObjeto;

public class Main_mercados {
	
	public static void main(String[] args) {
		Mercado uniBlu = new Mercado();
		uniBlu.nome = "BluMercado";
		uniBlu.macasVendidasPorAno = 10;
		uniBlu.valorMacas = 2.5;
		uniBlu.laranjasVendidasPorAno = 15;
		uniBlu.valorLaranjas = 4.2;
		
		Mercado uniJo = new Mercado();
		uniJo.nome = "JoMercado";
		uniJo.macasVendidasPorAno = 12;
		uniJo.valorMacas = 1.2;
		uniJo.laranjasVendidasPorAno = 13;
		uniJo.valorLaranjas = 4.6;
		
		Mercado uniFlo = new Mercado();
		uniFlo.nome = "FloMercados";
		uniFlo.macasVendidasPorAno = 25;
		uniFlo.valorMacas = 7.3;
		uniFlo.laranjasVendidasPorAno = 15;
		uniFlo.valorLaranjas = 5.8;
		
		
		double VendaMaca;
		double VendaLaranja;
		
		vendaMaca();
		vendaLaranja();
		
	}
	
}
