package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int i = sc.nextInt();

        if ( i >= 0 & i < 7) {
            System.out.println("INFANTIL");
        }
        else if ( i >= 8 & i < 10) {
            System.out.println("JUVENIL");
        }
        else if ( i >= 11 & i < 15) {
            System.out.println("ADOLESCENTE");
        }
        else if ( i >= 16 & i < 30) {
            System.out.println("ADULTO");
        }
        else if ( i > 30) {
            System.out.println("SÊNIOR");
        }
    }
}
