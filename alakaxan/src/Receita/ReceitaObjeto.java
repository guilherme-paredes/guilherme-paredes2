package Receita;

public class ReceitaObjeto {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	
	public ReceitaObjeto(String nome, String cpf, String uf, double rendaAnual) {
	setnome(nome);
	setcpf(cpf);
	setuf(uf);
	setrendaAnual(rendaAnual);
	}
	
	public String getnome() {
		return nome;
	}
	public String getcpf() {
		return cpf;
	}
	public String getuf() {
		return uf;
	}
	public double getrendaAnual() {
		return rendaAnual;
	}
	
	public void setnome(String nome) {
		if(nome == null || nome.isBlank()){
			System.out.println("Erro Nome invalido.");
		}else {
		this.nome = nome;
		}
	}
	public void setcpf(String cpf) {
		if(cpf == null || cpf.isBlank() || cpf.length()!= 14){
			System.out.println("Erro CPF invalido.");
		}else {
		this.cpf = cpf;
		}
	
	}
	public void setuf(String uf) {
		if(uf == null || uf.isBlank() || uf.length() != 2){
			System.out.println("Erro UF invalido.");
		}else {
		this.uf = uf;
		}
	
	}
	public void setrendaAnual(double rendaAnual) {
		if(rendaAnual < 0) {
			System.out.println("Erro, valor invalido.");
		}else {
			this.rendaAnual = rendaAnual;
		} 
	}
	
	public double calcularImposto(){
		return rendaAnual * calcularAliquota();
	}
	private double calcularAliquota() {
		double aliquota = 0;
		if(rendaAnual <= 4000) {
			aliquota = 0;
		}else if(rendaAnual > 9000) {
			aliquota = 5.8 / 100;
		}else if(rendaAnual > 25000) {
			aliquota = 15 / 100;
		}else if(rendaAnual > 35000) {
			aliquota = 27.5 / 100;
		}else {
			aliquota = 30 / 100;
		}
		return aliquota;
	}

	@Override
	public String toString() {
		return "Receita_Objeto [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf + ", rendaAnual=" + rendaAnual + "]";
	}
		
	
	}


