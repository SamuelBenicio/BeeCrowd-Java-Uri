package bee_crowd_1073_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CalculoQuadrado calculo = new CalculoQuadrado(n);
		calculo.calculaPar2(n);
		
		
		
		
		sc.close();
	}

}
