package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        double n = sc.nextDouble();

        if (n < 1512) {
            System.out.println("Você recebe menos que um salãrio mínimo!");
        }
        else if (n == 1512){
            System.out.println("Você recebe um salário mínimo!");
        }
        else {
            System.out.println("Você recebe mais que um salário mínimo!");
        }
    }
}
