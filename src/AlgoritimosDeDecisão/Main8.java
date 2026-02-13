package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Somar \n 2-Subtrair \n 3-Multiplicar \n 4-Dividir \n 5-Sair \n Selecione uma opção:");
        int n = sc.nextInt();
        System.out.println("Insira X:");
        double x = sc.nextDouble();
        System.out.println("Insira Y:");
        double y = sc.nextDouble();

        switch (n){
            case 1:
                double soma = x + y;
                System.out.println("O resultado da soma é:" + soma);
                break;
            case 2:
                double sub = x - y;
                System.out.println("O resultado da subtração é:" + sub);
                break;
            case 3:
                double multi = x * y;
                System.out.println("O resultado da multiplicação é:" + multi);
                break;
            case 4:
                double div = x / y;
                System.out.println("O resultado da divisão é:" + div);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Opção Invalida");
        }

    }
}
