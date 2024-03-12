import java.util.Scanner;

public class bee_crowd_1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quad=0,cubo=0;
		int n = sc.nextInt();
		for(int i=1;i<=n;i+=1) {
			System.out.print(""+ i);
			quad = i*i;
			System.out.print(" "+ quad );
			cubo = i*i*i;
			System.out.println(" " + cubo);
		}
		
		
		sc.close();
	}

}
