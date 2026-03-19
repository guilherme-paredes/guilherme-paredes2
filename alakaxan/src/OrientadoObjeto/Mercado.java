package OrientadoObjeto;

public class Mercado {
	String nome;
	int macasVendidasPorAno;
	double valorMacas;
	int laranjasVendidasPorAno;
	double valorLaranjas;
	
	
	
	public double VendaMaca() {
		return macasVendidasPorAno * valorMacas;
		 	
	}
	public double VendaLaranja() {
		return laranjasVendidasPorAno * valorLaranjas;
		
	}
	public double laranjaOuMaca() {
		
		return 0;
		
	}
}
