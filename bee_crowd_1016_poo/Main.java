package bee_crowd_1016_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		Maior maior = new Maior(n1,n2,n3);
		maior.calculaMaior(n1, n2, n3);
		
		
		sc.close();
	}

}
