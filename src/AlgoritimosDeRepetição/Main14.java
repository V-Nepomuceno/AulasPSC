package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int limite = 0, inicio = 0;

        System.out.println("Informe um número inicial:");
        inicio = sc.nextInt();
        System.out.println("Informe um número limite:");
        limite = sc.nextInt();
        while (contador <= limite){
            contador = contador + inicio;
            contador++;

            if(contador % 2 == 0){
                contador = contador + contador;
            }
        }
        System.out.println("A soma dos números pares são:" + contador);
    }
}

