package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int i = sc.nextInt();

        if ( i >= 18) {
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade!");
        }
    }
}
