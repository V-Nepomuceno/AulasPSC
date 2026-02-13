package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        while (contador <= numero) {

            contador++;

            if(contador % 2 != 0){
                System.out.println("Impar:" + contador);
            }
        }
    }
}
