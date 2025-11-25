package AlgoritmosSequenciais;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        double A,area,pi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        A = scanner.nextInt();

        pi = 3.14159;
        area = pi * (A * A);

        System.out.println(" aréa = " + area);
    }

}