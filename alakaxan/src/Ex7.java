import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] numeros = new double[5];
		
		for (int i=0 ; i<5; i++) {
		System.out.println("Informe um número: ");
		numeros[i] = input.nextDouble();
	}
		double maior = numeros[0];
		double menor = numeros[0];
		double soma = 0;
		
		for(int i=0 ; i<5 ; i++) {
		if (numeros[i] > maior) {
		maior = numeros[i];
	}
		
		if (numeros[i] < menor) {
		menor = numeros[i];
	}
		soma += numeros[i];
	}	
		double media = soma / 5;
		System.out.println("\nMaior elemento: " + maior);
		System.out.println("Menor elemento: " + menor);
		System.out.println("Média: " + media);
		input.close();
	}
}
