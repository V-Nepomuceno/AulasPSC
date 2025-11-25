package AlgoritmosSequenciais;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        int A = scanner.nextInt();
        System.out.println("Informe o valor de B:");
        int B = scanner.nextInt();
        int X = A + B;

        System.out.println("X = " + X);
    }

}