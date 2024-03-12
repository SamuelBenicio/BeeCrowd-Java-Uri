package bee_crowd_2434_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menor =0;
		int repeticoes = sc.nextInt();
		int saldoInicial = sc.nextInt();
		Saldo saldo = new Saldo(saldoInicial);
		
		for(int i=0;i<repeticoes;i+=1) {
			int valor = sc.nextInt();
			saldoInicial = saldo.calculaSaldo(valor);
			if(i==0) {
				menor = saldoInicial;
			}
			else {
				if(saldoInicial<menor) {
					menor = saldoInicial;
				}
			}
			
		}
		System.out.println(menor);
		

		sc.close();
	}

}
