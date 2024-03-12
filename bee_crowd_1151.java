import java.util.Scanner;

public class bee_crowd_1151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 =0,n3=1,n4=1;
		for(int x=1;x<=n1;x+=1) {
			if(x==1) {
				System.out.print("0 ");
			}
			if(x==2) {
				System.out.print("1 ");
			}
			if(x==3) {
				System.out.print("1 ");
			}
			if(x>=3) {
				n4 = n3+n2;
				n2=n3;
				n3=n4;
				if(x==n1) {
					System.out.printf("%d%n",n4);
				}
				else if(x>3) {
					System.out.printf("%d ",n4);
				}
			}
		}
		sc.close();
	}

}
