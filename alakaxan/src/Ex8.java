public class Ex8 {

	public static void main(String[] args) {
		int[][] matriz = {
				{210, 3, 399900},
				{160, 3, 329900},
				{240, 3, 369000},
				{141, 2, 232000},
				{300, 4, 539900},
				{198, 4, 299900},
				{153, 3, 314900},
				{142, 3, 199000},
				{138, 3, 212000},
				{149, 3, 242500},
				{194, 4, 240000},
				{200, 3, 347000},
				{189, 3, 330000},
				{447, 5, 699900},
				{126, 3, 259900}
				};
			double somaPrecos = 0;
			int menorTamanho = matriz[0][0];
			int precoMenorTamanho = matriz[0][2];
			int maiorQuartos = matriz[0][1];
			int menorQuartos = matriz[0][1];
			int tamanhoMaiorQuartos = matriz[0][0];
			int tamanhoMenorQuartos = matriz[0][0];
			double somaTamanho300 = 0;
			int contador300 = 0;
			
				for (int i = 0; i < matriz.length; i++) {
				somaPrecos += matriz[i][2];
				
				if (matriz[i][0] < menorTamanho) {
				menorTamanho = matriz[i][0];
				precoMenorTamanho = matriz[i][2];
			}
				if (matriz[i][1] > maiorQuartos) {
				maiorQuartos = matriz[i][1];
				tamanhoMaiorQuartos = matriz[i][0];
			}
				if (matriz[i][1] < menorQuartos) {
				menorQuartos = matriz[i][1];
				tamanhoMenorQuartos = matriz[i][0];
			}
				if (matriz[i][2] > 300000) {
				somaTamanho300 += matriz[i][0];
				contador300++;
		}
	}
				double mediaPrecos = somaPrecos / matriz.length;
				
				double mediaTamanho300 = somaTamanho300 / contador300;
				
				int diferencaTamanho = tamanhoMaiorQuartos - tamanhoMenorQuartos;
				System.out.println("a) Média dos preços das casas: " + mediaPrecos);
				System.out.println("b) Preço da casa de menor tamanho: " + precoMenorTamanho);
				System.out.println("c) Diferença de tamanho da casa com o maior número de quartos para a casa com o\r\n" + "menor número de quartos?" + diferencaTamanho);
				System.out.println("d) Média do tamanho das casas que custam mais de 300.000 mil: " + mediaTamanho300);
	}

}
