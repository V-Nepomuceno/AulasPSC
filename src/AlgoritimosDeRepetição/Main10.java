package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int cod = 0, codMaior = 0, codMenor = 0;
        double peso = 0, pesoMaior = 0, pesoMenor = 500, pesototal = 0, media = 0;

        while(contador <= 90){
            System.out.println("informe o número do " + contador + "º boi:");
            cod = sc.nextInt();
            System.out.println("Informe o peso do " + contador + "º boi:");
            peso = sc.nextDouble();

            contador++;

            if(peso > pesoMaior){
                pesoMaior = peso;
                codMaior = cod;
            }
            if(peso < pesoMenor){
                pesoMenor = peso;
                codMenor = cod;
            }
            pesototal = pesototal + peso;
            media = pesototal / 90;
        }
        System.out.println("O boi mais gordo é o " + codMaior + " com " + pesoMaior);
        System.out.println("O boi mais magro é o " + codMenor + " com " + pesoMenor);
        System.out.println("A média de peso dos bois é de " + media);
    }
}


