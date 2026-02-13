package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        double peso, sexo;
        int contadorH = 0, contadorM = 0;


        while(contador <=10){
            System.out.println("Informe seu sexo: 1 - Masculino ou 2 - Feminino");
            sexo = sc.nextDouble();
            System.out.println("Informe seu peso: ");
            peso = sc.nextDouble();
            contador++;

            if(sexo == 1 & peso >=60 & peso <=80){
                contadorH++;
            }
            else if(sexo == 2 & peso >=50 & peso <=70){
                contadorM++;
            }
        }
        System.out.println("A quantidade de homens com peso entre 60 e 80 é: " + contadorH);
        System.out.println("A quantidade de mulheres com peso entre 50 e 70 é: " + contadorM);
    }
}

