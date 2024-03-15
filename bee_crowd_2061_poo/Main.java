package bee_crowd_2061_poo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nFinal =0;
        int nInicial = sc.nextInt();
        int repeticoes = sc.nextInt();
        Navegador navegador = new Navegador(nInicial,repeticoes);

        for (int i = 0; i <= repeticoes; i += 1) {
            String acao = sc.nextLine();
           if(i==0) {
               nFinal = navegador.calculaAbas(nInicial, acao);
           }
           else {
               nFinal = navegador.calculaAbas(nFinal,acao);
           }
        }
        System.out.println(nFinal);
        sc.close();
    }
}