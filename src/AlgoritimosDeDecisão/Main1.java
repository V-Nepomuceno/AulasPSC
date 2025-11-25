package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de maçãs compradas:");
        int q = sc.nextInt();

        if (q < 12) {
            double mn12 = q * 1.00;
            System.out.println("Valor total da compra: R$" + mn12);
        }
        else if (q > 12) {
            double mr12 = q * 1.30;
            System.out.println("Valor total da compra: R$" + mr12);
        }
    }
}


