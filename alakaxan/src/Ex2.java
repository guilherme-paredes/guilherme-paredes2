import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Informe o seu nome: ");
		String nome = input.next();
		
		System.out.println("Informe o seu salário: ");
		double salario = input.nextDouble();
		
		System.out.println("Informe o valor total de vendas efetuadas no mês: ");
		double venda = input.nextDouble();
		
		double comissao = (venda * 15) / 100;
		double totalsala = salario + comissao;
		
		System.out.println("O vendedror: " + nome + " irá receber o total de: R$" + df.format(totalsala) + " no final do mês.");
		input.close();
	}

}
