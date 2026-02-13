package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        double temp = 0, media = 0, temptotal = 0;

        while(contador <= 10){
            System.out.println("Informe a temperatura do dia " + contador + "/01/2021:");
            temp = sc.nextDouble();
            contador++;
        }
        temptotal = temptotal + temp;
        media = temptotal / 10;
        System.out.println("A média da temperatura do mês de janeiro é: " + media);
    }
}

