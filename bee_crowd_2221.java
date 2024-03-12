import java.util.Scanner;
public class bee_crowd_2221 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int golpeD = 0,golpeG =0;
		for(int i=0;i<t;i+=1) {
			int bonus = sc.nextInt();
			int DAi = sc.nextInt();
			int DDi = sc.nextInt();
			int DLi = sc.nextInt();
			
			int GAi = sc.nextInt();
			int GDi = sc.nextInt();
			int GLi = sc.nextInt();
			
			if(DLi%2==0 || GLi%2==0) {
				golpeD = ((DAi+DDi)/2)+bonus;
				golpeG = ((GAi+GDi)/2)+bonus;
			}
			else {
				golpeD = ((DAi+DDi)/2);
				golpeG = (GAi+GDi)/2;
			}
			if(golpeD>golpeG) {
				System.out.println("Dabriel");
			}
			else if(golpeG>golpeD) {
				System.out.println("Guarte");
			}
			else if(golpeG==golpeD) {
				System.out.println("Empate");
			}
		}
		
		sc.close();
	}

}
