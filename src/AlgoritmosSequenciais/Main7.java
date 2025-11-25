package AlgoritmosSequenciais;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do Funcionário:");
        String nome = scanner.next();

        System.out.println("Salario Fixo:");
        double salario = scanner.nextDouble();
        System.out.println("Total de Vendas:");
        double vendas = scanner.nextDouble();

        double st = salario + (vendas / 100 * 15);

        System.out.println("Nome:" + nome);
        System.out.println("Salario total = R$ " + st);
    }

}