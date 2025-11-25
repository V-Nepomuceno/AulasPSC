package AlgoritmosSequenciais;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira A:");
        Double a = sc.nextDouble();
        System.out.println("Insira B:");
        Double b = sc.nextDouble();
        System.out.println("Insira C:");
        Double c = sc.nextDouble();

        double pi = 3.14159;

        double areat = (a * c) / 2;
        double cirr = pi * Math.pow(c, 2);
        double at = ( a + b ) * c / 2;
        double areaq = Math.pow(b,2);
        double arear = a * b;

        System.out.println( "TRIANGULO = " + areat);
        System.out.println( "CIRCULO = " + cirr);
        System.out.println( "TRAPEZIO = " + at);
        System.out.println( "QUADRADO = " + areaq);
        System.out.println( "RETÂNGULO = " + arear);

    }

}
