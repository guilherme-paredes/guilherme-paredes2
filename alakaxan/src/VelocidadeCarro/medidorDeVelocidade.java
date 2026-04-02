package VelocidadeCarro;

public class medidorDeVelocidade {
	private int velocidade;
	private String carro; 
	
	public medidorDeVelocidade(int velocidade,String carro) {
		setvelocidade(velocidade);
	}
	
	public int getVelocidade() {
		return velocidade;
		
	}
	public String getcarro() {
		return carro;
		
	}
	public void setvelocidade(int velocidade) {
		if(velocidade < 0) {
			throw new IllegalArgumentException("Velocidade impossivel");
		}
		this.velocidade = velocidade;
	}
	public void setcarro(String carro) {
		if(carro.isBlank()) {
			throw new IllegalArgumentException("Nome invalido");
		}
	}
	
	public void acelerar(int velP){
		if(velP > 0 && velP > 20) {
			throw new IllegalArgumentException("Aceleração invalida");
		}
		this.velocidade = velocidade + velP;
		}
	
	public void reduzir(int velP){
	if(velP <= 0 && velP > 30) {
		throw new IllegalArgumentException("Redução invalida");
	}
	this.velocidade = velocidade - velP;
		}
	}

