import java.util.Scanner;

public class bee_crowd_1172 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		for(int i=0;i<10;i+=1) {
			numeros[i] = sc.nextInt();
			if(numeros[i]<0 || numeros[i]==0) {
				numeros[i] = 1;
			}
			System.out.printf("X[%d] = %d%n",i,numeros[i]);
			
		}
		//for(int k=0;k<10;k+=1) {
		//}
		
		
		
		sc.close();
	}

}
