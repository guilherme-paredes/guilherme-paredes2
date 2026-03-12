package OrientadoObjeto;

public class Main_Circulo {
public static void main(String[] args) {
	Circulo c1 = new Circulo();
	c1.raio = 1;
	
	Circulo c2 = new Circulo();
	c2.raio = 2;
	
	Circulo c3 = new Circulo();
	c3.raio = 3;
	
	Circulo c4 = new Circulo();
	c4.raio = 4;
	
	System.out.println(c1.calcularArea() + " " + c2.calcularArea() + " " + c3.calcularArea() + " " + c4.calcularArea());
}
}
