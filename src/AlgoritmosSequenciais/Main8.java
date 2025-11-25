package AlgoritmosSequenciais;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Código do Produto 1:");
        int codigo1 = sc.nextInt();
        System.out.println("Quant prod 1:");
        int quantidade1 = sc.nextInt();
        System.out.println("Valor prod 1:");
        double valor1 = sc.nextDouble();

        System.out.println("Cod produto 2:");
        int peca2 = sc.nextInt();
        System.out.println("Quant produto 2:");
        int quantidade2 = sc.nextInt();
        System.out.println("Valor produto 2:");
        double valor2 = sc.nextDouble();
        double total = valor1 * quantidade1 + valor2 * quantidade2;

        System.out.println("Valor total = R$ " + total);

    }
}