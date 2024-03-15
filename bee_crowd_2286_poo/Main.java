package bee_crowd_2286_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPartidas =1;
        int nTestes = 1;
        String nome1 =null;
        String nome2 = null;
        String vencedor = null;
        while(nPartidas!=0) {
            nPartidas = sc.nextInt();
            for (int i = 0; i < nPartidas; i += 1) {
                sc.nextLine();
                if(i==0) {
                    nome1 = sc.nextLine();
                    nome2 = sc.nextLine();
                }
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(i==0) {
                    Partida partida = new Partida(nome1, nome2, num1, num2);
                    System.out.printf("Teste %d%n",nTestes);
                    vencedor = partida.calculaVencedor(num1,num2);
                    nTestes +=1;
                }
                else{
                    Partida partida = new Partida(nome1, nome2, num1, num2);
                    vencedor = partida.calculaVencedor(num1,num2);
                }
                System.out.println(vencedor);
                if(i==nPartidas -1 ) {
                	System.out.println();
                }



            }
        }


        sc.close();
    }
}
