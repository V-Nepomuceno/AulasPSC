package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        double numero = 0;

        while(contador <= 5){
            System.out.println("Digite um número: ");
            numero = sc.nextDouble();

            double d2 = numero * 2;
            System.out.println("O dobro do número digitado é: " + d2);

            contador++;
        }
    }
}

