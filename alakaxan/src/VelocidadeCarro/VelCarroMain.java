package VelocidadeCarro;import javax.swing.AbstractCellEditor;

public class VelCarroMain {
	public static void main(String[] args) {
		int velP = 15;
		medidorDeVelocidade c1 = new medidorDeVelocidade(0, "Carro1");
		medidorDeVelocidade c2 = new medidorDeVelocidade(10, "Carro2");
		
		c1.acelerar(velP);
		System.out.println("Resultado " + c1.getVelocidade());
		velP = velP + 5;
		System.out.println("velp " + velP);
		System.out.println("Resultado " + c1.getVelocidade());
		c1.acelerar(velP);
		System.out.println("Resultado " + c1.getVelocidade());
		velP = velP + 8;
		System.out.println("velp " + velP);
		c1.reduzir(velP);
		System.out.println("Resultado " + c1.getVelocidade());
	}
}
