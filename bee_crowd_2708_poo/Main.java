package bee_crowd_2708_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String trafego = null;
		int total =0,contadorJeeps =0;
		while(trafego!="ABEND") {
			trafego = sc.nextLine();
			if(trafego.equals("ABEND")) {
				break;
			}
			int quantidadeCarros = sc.nextInt();
			Turistas turistas = new Turistas(trafego,quantidadeCarros);
			contadorJeeps += turistas.calculaQuantidadeJeep(trafego);
			total += turistas.totalTuristas(quantidadeCarros);
			System.out.println(total);
			sc.nextLine();
		}
		System.out.println(total);
		System.out.println(contadorJeeps);
		sc.close();
	}
}

