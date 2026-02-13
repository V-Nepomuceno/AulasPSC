package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 0;
        double totalsalario = 0;
        int contador = 0;
        int filhos = 0;
        int totalfilhos = 0;

        while(salario >= 0){
            System.out.println("Digite o salário: ");
            salario = sc.nextDouble();
            if(salario >= 0){
                System.out.println("Digite a quantidade de filhos: ");
                filhos = sc.nextInt();
                contador++;
                totalsalario = totalsalario + salario;
                totalfilhos = totalfilhos + filhos;
            }
            else{
                System.out.println("Salário inválido!");
            }
        }
        double mediasalario = totalsalario / contador;
        int mediafilhos = totalfilhos / contador;
        System.out.println("A média de salário da população é: " + mediasalario);
        System.out.println("A média de filhos da população é: " + mediafilhos);
    }
}
