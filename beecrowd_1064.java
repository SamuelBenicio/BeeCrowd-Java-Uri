import java.util.Scanner;
import java.util.Locale;

public class beecrowd_1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double n1 = 0,media = 0;
		int i = 6,cont= 0, contp=0;	
		while(i!=0) {
			n1 = sc.nextDouble();
			if(n1>0) {
				cont +=1;
				media += n1;
				contp +=1;
			}
			i-=1;
		}
		media = media/contp;
		System.out.printf("%d valores positivos%n",cont);
		System.out.printf("%.1f%n",media);
		sc.close();
	}

}
