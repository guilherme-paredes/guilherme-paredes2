package OrientadoObjeto;

public class Main_mercados {

	public static void main(String[] args) {
		
		Mercado uniBlu = new Mercado();
		uniBlu.nome = "BluMercado";
		uniBlu.macasVendidasPorAno = 1;
		uniBlu.valorMacas = 1.5;
		uniBlu.laranjasVendidasPorAno = 2;
		uniBlu.valorLaranjas = 2.5;
		
		Mercado uniJo = new Mercado();
		uniJo.nome = "JoMercado";
		uniJo.macasVendidasPorAno = 2;
		uniJo.valorMacas = 2.5;
		uniJo.laranjasVendidasPorAno = 3;
		uniJo.valorLaranjas = 3.5;
		
		Mercado uniFlo = new Mercado();
		uniFlo.nome = "FloMercados";
		uniFlo.macasVendidasPorAno = 4;
		uniFlo.valorMacas = 4.5;
		uniFlo.laranjasVendidasPorAno = 5;
		uniFlo.valorLaranjas = 5.5;
		
		
		uniBlu.VendaMaca();
		uniJo.VendaMaca();
		uniFlo.VendaMaca();
		
		uniBlu.VendaLaranja();
		uniJo.VendaLaranja();
		uniFlo.VendaLaranja();
		
		Mercado[] listaMercados = {uniBlu, uniJo, uniFlo}; 
		
		double receitaTotalM = 0;
		double receitaTotalL= 1;
		
		Mercado maisCaroM = listaMercados[0];
	    for (int i = 0; i < listaMercados.length; i++) {
	        if (listaMercados[i].VendaMaca() > maisCaroM.VendaLaranja()) {
	            maisCaroM = listaMercados[i];
	             receitaTotalM = receitaTotalM + listaMercados[i].VendaMaca();
	        }
	    }
	    
	    Mercado menosCaroL = listaMercados[0];
	    for (int i = 0; i < listaMercados.length; i++) {
	        if (listaMercados[i].VendaLaranja() < menosCaroL.VendaLaranja()) {
	            menosCaroL = listaMercados[i];
	            receitaTotalL = listaMercados[i].VendaLaranja();
	        }}
	    
	System.out.println(maisCaroM.nome + ", "+ menosCaroL.nome);
	System.out.println(receitaTotalM +", "+ receitaTotalL);
	}
	    
	    
	 
	    
	
}
