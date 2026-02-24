import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a massa em quilogramas do material radioativo: ");
		double massa = input.nextDouble();
		double massaIni = massa;
		int tempo = 0;
		while(massa >= 0.0005) {
		massa = massa / 2;
		tempo = tempo + 50;
		}
		System.out.println("Massa Inicial: " + massaIni + " kg\nMassa final: " + massa + " kg\nTempo: " + tempo + " segundos");
		input.close();
		}
	}