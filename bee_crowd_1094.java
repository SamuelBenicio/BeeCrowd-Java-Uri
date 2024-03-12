import java.util.Scanner;
import java.util.Locale;

public class bee_crowd_1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int totcob = 0,tots = 0,totrat = 0,totcoe = 0;
		int n = sc.nextInt();
		for(int i =0;i<n;i+=1) {
			int n1 = sc.nextInt();
			char tipo = sc.next().charAt(0);
			totcob +=n1;
					
			if(tipo=='C') {
				totcoe += n1;
			}
			else if(tipo=='S') {
				tots += n1;
			}
			else if(tipo=='R') {
				totrat += n1;
			}
			
		}
		System.out.printf("Total: %d cobaias%n",totcob);
		System.out.printf("Total de coelhos: %d%n",totcoe);
		System.out.printf("Total de ratos: %d%n",totrat);
		System.out.printf("Total de sapos: %d%n",tots);
		
		double perC = ((double)totcoe/totcob)*100,perS = ((double)tots/totcob)*100,perR = ((double)totrat/totcob)*100;
		System.out.printf("Percentual de coelhos: %.2f %%\n", perC);
		System.out.printf("Percentual de ratos: %.2f %%\n", perR);
		System.out.printf("Percentual de sapos: %.2f %%\n", perS);
		
		sc.close();
	}

}
