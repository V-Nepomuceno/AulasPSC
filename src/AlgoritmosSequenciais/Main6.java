package AlgoritmosSequenciais;

import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        int n,hora;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número do Funcionário:");
        n = scanner.nextInt();

        System.out.println("Horas Trabalhadas:");
        hora = scanner.nextInt();

        System.out.println("Valor Hora:");
        double valor = scanner.nextDouble();

        double salario = hora * valor;

        System.out.println("NUMBER:" + n);
        System.out.println("SALARY = R$ " + salario);
    }

}