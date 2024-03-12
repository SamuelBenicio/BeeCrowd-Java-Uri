package bee_crowd_2863_poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	double maior =0;
	
	while(sc.hasNext()){
		int repeticoes = sc.nextInt();
		
		for(int i=0;i<repeticoes;i+=1) {
			double tempo = sc.nextDouble();
			Umil_bolt bolt = new Umil_bolt(tempo);
			
			if(i==0) {
				maior = tempo;
			}
			else if(tempo<maior) {
				maior =tempo;
			}
			
			if(i==repeticoes-1) {
				System.out.println(maior);
			}
		}
	}
	
	
	sc.close();
	}
}
