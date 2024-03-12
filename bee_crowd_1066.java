import java.util.Scanner;
public class bee_crowd_1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int contPar = 0,contImpar=0,contP = 0,contN = 0;
			int n = 5;
			for(int i = 1;i<=n;i+=1) {
				int n1 = sc.nextInt();
				if(n1%2==0) {
					contPar +=1;
				}
				else {
					contImpar +=1;
				}
				if(n1>0) {
					contP +=1;
				}
				else if(n1<0) {
					contN +=1;
				}
			}
		System.out.printf("%d valor(es) par(es)%n",contPar);
		System.out.printf("%d valor(es) impar(es)%n",contImpar);
		System.out.printf("%d valor(es) positivo(s)%n",contP);
		System.out.printf("%d valor(es) negativo(s)%n",contN);
		sc.close();
	}

}
