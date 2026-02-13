package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salãrio atual: R$");
        double s = sc.nextDouble();
        double st = s + s * 0.30;

        if (s <= 1000){
            System.out.println("O reajusta é: R$" + st);
        }
        else {
            System.out.println("Você não pode receber o reajuste!");
        }
    }
}
