import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int inscricao;
		double altura;
		double maiorAltura = 0;
		double menorAltura = 0;
		int maiorInscricao = 0;
		int menorInscricao = 0;
		double somaAltura = 0;
		int atletas = 0;
		
		System.out.println("Informe o seu número de inscrição (0 para sair): ");
		inscricao = input.nextInt();
		
		while (inscricao != 0) {
		System.out.println("Informe a sua altura em metros: ");
		altura = input.nextDouble();
		atletas++;
		somaAltura += altura;
		
		if(atletas == 1) {
		menorAltura = altura;
		maiorAltura = altura;
		maiorInscricao = inscricao;
		menorInscricao = inscricao;
	} 
		else {
		
		if (altura < menorAltura) {
		menorAltura = altura;
		menorInscricao = inscricao;
	}
		if (altura > maiorAltura) {
		maiorAltura = altura;
		maiorInscricao = inscricao;
	}
	}
		System.out.print("\nDigite o número de inscrição (0 para sair): ");
		inscricao = input.nextInt();
		}
		
		double mediaAltura = somaAltura / atletas;
		
		if (atletas > 0) {
			
		System.out.println("\nAtleta mais alto:\nInscrição: " + maiorInscricao + "\nAltura: " + maiorAltura + "\n");
		System.out.println("Atleta mais baixo:\nInscrição: " + menorInscricao + "\nAltura: " + menorAltura + "\n");
		System.out.println("Média de altura: " + mediaAltura + "\n");
		System.out.println("Quantidade de atletas cadastrados: " + atletas);
			} 
		else {
				System.out.println("Nenhum atleta cadastrado.");
				}
				input.close();
		}
	}
