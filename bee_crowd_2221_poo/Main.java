package bee_crowd_2221_poo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int repeticoes = sc.nextInt();
        for(int i = 0;i<repeticoes;i+=1){
            int bonus = sc.nextInt();
            Pokemon dabriel = new Pokemon(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Pokemon guarte = new Pokemon(sc.nextInt(),sc.nextInt(),sc.nextInt());
            double valorGolpeGuarte = guarte.valorGolpe(bonus);
            double valorGolpeDabriel =dabriel.valorGolpe(bonus);
            if(valorGolpeGuarte>valorGolpeDabriel){
                System.out.println("Guarte");
            }
            else if(valorGolpeGuarte<valorGolpeDabriel){
                System.out.println("Dabriel");
            }
            else if(valorGolpeGuarte==valorGolpeDabriel){
                System.out.println("Empate");
            }
        }

        sc.close();
    }

}
