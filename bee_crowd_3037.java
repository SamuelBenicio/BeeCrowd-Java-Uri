import java.util.Scanner;

public class bee_crowd_3037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int pontj = 0,pontm=0;
		for(int i =0;i<n;i+=1) {
			int x1 = sc.nextInt();
			int d1 = sc.nextInt();
			int x2 = sc.nextInt();
			int d2 = sc.nextInt();
			int x3 = sc.nextInt();
			int d3 = sc.nextInt();
			int y1 = sc.nextInt();
			int e1 = sc.nextInt();
			int y2 = sc.nextInt();
			int e2 = sc.nextInt();
			int y3 = sc.nextInt();
			int e3 = sc.nextInt();
			
			pontj =(x1*d1)+(x2*d2)+(x3*d3);
			pontm = (y1*e1)+(y2*e2)+(y3*e3);
			if(pontj>pontm) {
				System.out.println("JOAO");
			}
			else if(pontm>pontj) {
				System.out.println("MARIA");
			}
		}
		
		sc.close();
	}
}
