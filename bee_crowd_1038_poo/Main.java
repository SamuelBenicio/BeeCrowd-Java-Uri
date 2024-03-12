package bee_crowd_1038_poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		Cantina cantina = new Cantina(codigo,quantidade);
		System.out.printf("Total: R$ %.2f%n",cantina.calculaTotal());
		

		sc.close();
	}

}
