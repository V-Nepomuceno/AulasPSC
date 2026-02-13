package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nº da sua conta:");
        int nc = sc.nextInt();
        System.out.println("Insira seu saldo: R$");
        double s = sc.nextDouble();
        System.out.println("Insira seus débitos: R$");
        double d = sc.nextDouble();
        System.out.println("Informe seus créditos: R$");
        double c = sc.nextDouble();

        double st = s - d + c;

        if (st < 0) {
            System.out.println("Seu saldo é negativo! \n R$" + st);
        }
        else {
            System.out.println("Seu saldo é positivo! \n R$" + st);
        }
    }
}
