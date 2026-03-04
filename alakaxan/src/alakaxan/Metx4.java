package alakaxan;

public class Metx4 {

	public static void main(String[] args) {
		
		int vetor[] = {1,2,3,4,5};
		
		maiorValor(vetor);
		menorValor(vetor);
		media(vetor);
	}
	
	public static void maiorValor(int vetor[]) {
		int maiorValor = Integer.MIN_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i]> maiorValor) {
				maiorValor = vetor[i];
			}
		}
		System.out.println(maiorValor);
	}
	 public static void menorValor(int vetor[]) {
		 int menorValor = Integer.MAX_VALUE;
		 
		 for(int i = 0; i < vetor.length; i++) {
			 if(vetor[i] < menorValor) {
				 menorValor = vetor[i];
			 }
		 }
		System.out.println(menorValor);
	}
	 public static void media(int vetor[]) {
		 double soma = 0;
		
		 for(int i = 0; i < vetor.length; i++) {
			 soma += vetor [i];
		 }
		 double media = soma / vetor.length;
		 
		 System.out.println(media);
	}
}
