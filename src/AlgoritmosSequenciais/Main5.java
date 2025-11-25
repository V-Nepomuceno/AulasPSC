package AlgoritmosSequenciais;

import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        int A,B,C,D,DIFERENCA;
        Scanner scanner = new Scanner(System.in);
        System.out.println("A:");
        A = scanner.nextInt();

        System.out.println("B:");
        B = scanner.nextInt();

        System.out.println("C:");
        C = scanner.nextInt();

        System.out.println("D:");
        D = scanner.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println(" SOMA = " + DIFERENCA);
    }

}
