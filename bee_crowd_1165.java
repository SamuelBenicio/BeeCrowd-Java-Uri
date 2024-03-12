import java.util.Scanner;

public class bee_crowd_1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, cont = 0;
		int n1 = sc.nextInt();
		for (int i = 1; i <= n1; i += 1) {
			x = sc.nextInt();
			for (int k = 1; k <= x; k += 1) {
				if (x % k == 0) {
					cont += 1;
				}
			}
				if (cont == 2) {
					System.out.printf("%d eh primo%n", x);
					cont = 0;
				} else {
					System.out.printf("%d nao eh primo%n", x);
					cont = 0;
				}

		}
		sc.close();
	}

}
