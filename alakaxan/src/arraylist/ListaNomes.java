package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(5);
		lista1.add(6);
		lista1.add(7);
		lista1.add(8);
		lista1.add(9);
		lista1.add(10);
	System.out.println(lista1);
	
		lista1.sort(Collections.reverseOrder());
	 System.out.println(lista1);
	 
	 lista1.sort(null);
	 System.out.println(lista1.get(0));
	 System.out.println(lista1.get(lista1.size()-1));
	 
	 double media = 0;
	 for(int i = 0; i < lista1.size(); i++) {
		media =  media + lista1.get(i);	
	 }
	 System.out.println(media/lista1.size());
	 
	 System.out.println("escreva um numero: ");
	 int pesquisa = input.nextInt();
	 
	 boolean resultado = lista1.contains(pesquisa);
	 
	 System.out.println(resultado);
	 System.out.println("o indice de "+ pesquisa +" é:" + lista1.indexOf(pesquisa));
	 
	
}
}
