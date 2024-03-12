package bee_crowd_1009_poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome = sc.nextLine();
		double salario = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome,salario,totalVendas);
		System.out.printf("TOTAL = R$ %.2f%n",funcionario.calcularBonus());
		
	
		sc.close();
	}

}
