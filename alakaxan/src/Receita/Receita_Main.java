package Receita;

public class Receita_Main {
	public static void main(String[] args) {
		ReceitaObjeto joao = new ReceitaObjeto("João", "001.001.001-01", "SC", 1000);
		ReceitaObjeto maria = new ReceitaObjeto("Maria", "002.002.002-02", "SC", 5500);
		ReceitaObjeto pedro = new ReceitaObjeto("Pedro", "003.003.003-03", "SC", 12000);
		ReceitaObjeto maisa = new ReceitaObjeto("Maisa", "004.004.004-04", "SC", 26500);
		ReceitaObjeto cleber = new ReceitaObjeto("Cleber", "005.005.005-05", "SC", 50000);
		
		ReceitaObjeto listaPessoas[] = {joao,maria,pedro,maisa,cleber};
		
		double maiorValor = 0;
		ReceitaObjeto quemMaisPagou = null ;
		for (int i = 0; i < listaPessoas.length; i++) {
			if (listaPessoas[i].calcularImposto() > maiorValor) {
				maiorValor = listaPessoas[i].calcularImposto();
				quemMaisPagou = listaPessoas[i];
			}
		}
		double totalDeImposto = 0;
		for (int i = 0; i < listaPessoas.length; i++) {
			totalDeImposto = listaPessoas[i].calcularImposto() + totalDeImposto;
		}
		System.out.println("Quem mais pagou: " + quemMaisPagou);
		System.out.println("Total de imposto pago por todos foi: " + totalDeImposto);
	}
	
}
