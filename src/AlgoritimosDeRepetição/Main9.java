package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int numero = 0;
        double numerototal = 0;
        double media = 0;

        while(contador <= 75){
            System.out.println("Informe o " + contador + "º número inteiro e positivo:");
            numero = sc.nextInt();
            contador++;
        }
        numerototal = numerototal + numero;
        media = numerototal / 75;
        System.out.println("A média dos números informados é: " + media);
        System.out.println("A quantidade de números lidos é: " + 75);
    }
}
