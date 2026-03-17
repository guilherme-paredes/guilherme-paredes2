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
		
		
		uniBlu.VendaMaca();
		uniJo.VendaMaca();
		uniFlo.VendaMaca();
		
		uniBlu.VendaLaranja();
		uniJo.VendaLaranja();
		uniFlo.VendaLaranja();
		
		Mercado[] listaMercados = {uniBlu, uniJo, uniFlo}; 
		
		Mercado maisCaroM = listaMercados[0];
	    for (int i = 0; i < listaMercados.length; i++) {
	        if (listaMercados[i].VendaMaca() > maisCaroM.VendaMaca()) {
	            maisCaroM = listaMercados[i];
	        }
	    }
	    
	    Mercado menosCaroL = listaMercados[0];
	    for (int i = 0; i < listaMercados.length; i++) {
	        if (listaMercados[i].VendaLaranja() < menosCaroL.VendaLaranja()) {
	            menosCaroL = listaMercados[i];
	        }}
	}
	    
	    
	 public static double laranjaOuMaca(Mercado[]listaMecados) {
			double receitaTotal = uniBlu.VendaMaca() + uniJo.VendaMaca() + uniFlo.VendaMaca();
			return 0;
	    
	
}
}