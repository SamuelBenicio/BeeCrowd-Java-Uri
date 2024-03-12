import java.util.Scanner;

public class bee_crowd_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somaim = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int menor = Math.min(x, y);
        int maior = Math.max(x, y);

		for(int n1 = menor+1;n1<maior;n1+=1) {
			if(n1%2!=0) {
				somaim +=n1;
			}
		}
		
		System.out.println(somaim);
		sc.close();
	}

}
