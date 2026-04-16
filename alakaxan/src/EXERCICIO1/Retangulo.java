package EXERCICIO1;

	public class Retangulo{
		private double largura;
		private double altura;
		
		public Retangulo(double largura, double altura) {
			super();
			this.largura = largura;
			this.altura = altura;
		}
		
		public void setAltura(double altura){
			if(altura <=0) {
				throw new IllegalArgumentException("Altura não pode ser menor igual que 0");
			}
			this.altura = altura;
		}
		public void setlargura(double largura){
			if(largura <=0) {
				throw new IllegalArgumentException("largura não pode ser menor igual que 0");
			}
			this.largura = largura;
		}
		
		public double obterArea() {
			return largura*altura;
		}
		public double obterPerimetro() {
			return (largura*2)+(altura*2);
		}

		@Override
		public String toString() {
			return "Retangulo [largura=" + largura + ", altura=" + altura + "]";
		}
		
	
	}
