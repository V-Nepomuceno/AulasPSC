package AlgoritmosSequenciais;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o Raio:");
        Double r = sc.nextDouble();

        double pi = 3.14159;
        double volume = (4/3) * pi * Math.pow(r, 3);

        System.out.println( "VOLUME = " + volume);

    }

}
