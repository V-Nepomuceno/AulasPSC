package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1, contador90 = 0;
        int idade = 0;
        double peso = 0, mediapeso = 0, pesototal = 0;

        while(contador <= 7){
            System.out.println("informe sua idade:");
            idade = sc.nextInt();
            System.out.println("informe seu peso:");
            peso = sc.nextDouble();
            contador++;
            pesototal = pesototal + peso;
            if(peso > 90){
                contador90++;
            }
        }
        mediapeso = pesototal / 7;
        System.out.println("a quantidade de pessoas com mais de 90kg é: " + contador90);
        System.out.println("a media de peso é: " + mediapeso);
    }
}
