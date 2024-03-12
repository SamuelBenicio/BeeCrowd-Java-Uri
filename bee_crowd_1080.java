import java.util.Scanner;

public class bee_crowd_1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 100,maior=0,pos=0;
		for(int i =1;i<=n1;i+=1) {
			int x = sc.nextInt();
			if(x>maior) {
				maior = x;
				pos = i;
			}
		}
		System.out.println(maior);
		System.out.println(pos);
		sc.close();
	}

}
