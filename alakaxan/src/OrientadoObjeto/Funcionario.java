package OrientadoObjeto;

public class Funcionario {

	String identificacao;
	String nome;
	String sobrenome;
	Double salario;
	
	public double salarioAno() {
		double salTotal = salario * 12;
		return salTotal;
	}
	public String nomeCompleto() {
		String nomeTodo = nome + " " + sobrenome;
		return nomeTodo;
		
	}
	public void salAumento(double aumento) {
		double porcentagem = aumento / 100;
		double salNovo = salario + (salario * porcentagem);
		salario =  salNovo;
		
	}
}
