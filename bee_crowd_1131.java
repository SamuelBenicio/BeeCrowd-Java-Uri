import java.util.Scanner;

public class bee_crowd_1131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int conti =0,vGremio=0,vInter=0,empate=0,contj=0;
		do {
			int GolInter = sc.nextInt();
			int GolGremio = sc.nextInt();
			System.out.println("Novo grenal (1-sim 2-nao)");
			conti = sc.nextInt();
			contj +=1;
			if(GolInter>GolGremio) {
				vInter +=1;
			}
			else if(GolGremio>GolInter) {
				vGremio +=1;
			}
			else if(GolInter==GolGremio) {
				empate +=1;
			}
		} while(conti!=2);
		System.out.printf("%d grenais%n",contj);
		System.out.printf("Inter:%d%n",vInter);
		System.out.printf("Gremio:%d%n",vGremio);
		System.out.printf("Empates:%d%n",empate);
		if(vInter>vGremio) {
			System.out.println("Inter venceu mais");
		}
		else if(vGremio>vInter) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		sc.close();
	}

}
