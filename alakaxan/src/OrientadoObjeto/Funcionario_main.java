package OrientadoObjeto;

public class Funcionario_main {
	public static void main(String[] args) {
		  double aumento = 15;
		  Funcionario jeff = new Funcionario();
		  jeff.identificacao = "12345";
		  jeff.nome = "Jeff";
		  jeff.sobrenome = "Santos";
		  jeff.salario = 100.0;
		  
		  System.out.println(jeff.nomeCompleto() + " ganhando " + jeff.salarioAno() + " por ano " + jeff.nomeCompleto() +" vai ganhar um aumento de 15% ");
		  jeff.salAumento(aumento);
		  System.out.println("Então o Salario vai ficar:"+jeff.salario + "e o salario anual vai fica: " + jeff.salarioAno());
	}

}
