import java.util.Scanner;
import java.util.Locale;

public class bee_crowd_1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double media =0;
		int n = sc.nextInt();
		for(int i = 0;i<n;i+=1) {
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
			System.out.printf("%.1f%n",media);
		}
		sc.close();
	}

}
