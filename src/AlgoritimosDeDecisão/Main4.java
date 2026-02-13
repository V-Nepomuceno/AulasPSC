package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a dureza:");
        int d = sc.nextInt();
        System.out.println("Insira o teor de carvão:");
        double t = sc.nextDouble();
        System.out.println("Insira a resistência à tração:");
        int r = sc.nextInt();

        if ( d > 50 & t < 0.7 & r > 5600 ) {
            System.out.println("Pontuação: 10");
        }
        else if ( d > 50 &  t < 0.7 & r <= 5600 ) {
            System.out.println("Pontuação: 9");
        }
        else if ( d <= 50 & t < 0.7 & r > 5600) {
            System.out.println("Pontuação: 8");
        }
        else if ( d > 50 & t > 0.7 & r > 5600) {
            System.out.println("Pontuação: 7");
        }
        else if ( d > 50 | t < 0.7 | r > 5600) {
            System.out.println("Pontuação: 6");
        }
        else if ( d <= 50 & t > 0.7 & r <= 5600) {
            System.out.println("Pontuação: 5");
        }
    }
}
