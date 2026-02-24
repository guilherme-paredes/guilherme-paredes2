import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.println("informe o número de matricula: ");
		String matricula = input.next();
		
		System.out.println("Informe seu Nome: ");
		String nome = input.next();
		
		System.out.println("Informe suas horas trabalhadas: ");
		double horas = input.nextDouble();
		
		System.out.println("Informe o valor que recebe por hora: ");
		double valor = input.nextDouble();
		
		double valortotal = horas * valor;
		
		System.out.println("Matricula: " + matricula);
		System.out.println("Funcionário: " + nome);
		System.out.println("Salário: " + dec.format(valortotal));
		
		input.close();
	}

}
