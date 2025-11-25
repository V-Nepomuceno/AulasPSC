package AlgoritmosSequenciais;

import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        int A,B,PROD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor 1:");
        A = scanner.nextInt();

        System.out.println("Valor 2:");
        B = scanner.nextInt();

        PROD = A * B;

        System.out.println(" SOMA = " + PROD);
    }

}