package EXERCICIO1;

import java.util.ArrayList;
import java.util.List;

public class EditaRetangulo {
	private List<Retangulo> mexeRetangulo;
	
	public EditaRetangulo() {
		mexeRetangulo = new ArrayList<>();
	}
	
	public void AdicionarRetangulo(Retangulo a) {
		mexeRetangulo.add(a);
	}
	
	public Retangulo obterRetanguloMaiorArea() {
		double maiorArea = Double.MIN_VALUE;
		Retangulo RetanguloMaiorArea = null;
		
		for(Retangulo a : mexeRetangulo) {
			if(a.obterArea() > maiorArea) {
				maiorArea = a.obterArea();
				RetanguloMaiorArea = a;
			}
		}
		return RetanguloMaiorArea;
	}
	
	public Retangulo obterRetanguloMaiorPerimetro() {
		double maiorPerimetro = Double.MIN_VALUE;
		Retangulo RetanguloMaiorPerimetro = null;
		
		for(Retangulo a : mexeRetangulo) {
			if(a.obterPerimetro() > maiorPerimetro) {
				maiorPerimetro = a.obterPerimetro();
				RetanguloMaiorPerimetro = a;
			}
		}
		return RetanguloMaiorPerimetro;
	}
}
