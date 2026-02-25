package alakaxan;
import java.util.Scanner;

public class Metx1 {
public static void main(String[] args) {
	cod();
}

public static void cod() {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe um numero de 1 a 4: ");
	String choise = input.next();
	
	switch(choise) {
	case "1" :
		System.out.println("É verão");
		break;
	case "2":
		System.out.println("É Outono");
		break;
	case "3":
		System.out.println("É inverno");
		break;
	case "4":
		System.out.println("É Primavera");
		break;
	default:
		System.out.println("Numero invalido");
	}
}
}