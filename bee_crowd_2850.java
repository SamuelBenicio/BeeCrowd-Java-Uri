import java.util.Scanner;

public class bee_crowd_2850 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String perna = sc.nextLine();
			if(perna.equals("esquerda")) {
				System.out.println("ingles");
			}
			else if(perna.equals("direita")) {
				System.out.println("frances");
			}
			else if(perna.equals("nenhuma")) {
				System.out.println("portugues");
			}
			else if(perna.equals("as duas")) {
				System.out.println("caiu");
			}
		}
			
		sc.close();
	}

}
