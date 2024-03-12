package bee_crowd_1050_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ddd = sc.nextInt();
		Discagem discagem = new Discagem(ddd);
		discagem.regiao(ddd);
		
		
	
		sc.close();
	}

}
