import java.util.Scanner;

public class bee_crowd_1175 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i+=1){
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length / 2; i+=1){
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }

        for (int i = 0; i < vetor.length; i+=1){
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
        
        sc.close();
    }
}