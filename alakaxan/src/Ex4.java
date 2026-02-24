import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Informe o dia do mês: ");
		int dia = input.nextInt();
		
		if (dia < 1 || dia > 31) {
		System.out.println("Dia do mês inválido.");
	} 
		else {
		System.out.println("Informe o mês: ");
		int mes = input.nextInt();
		
		if (mes < 1 || mes > 12) {
		System.out.println("Mês inválido.");
	} 
		else {
		System.out.println("Informe o ano: ");
		int ano = input.nextInt();
		System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
	}
}
		input.close();
		}
	}


