package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        double nota = 0, menornota = 15, maiornota = 0;;

        while(nota >= 0 & nota <= 15){
            System.out.println("Informe a nota do " + contador + "º aluno:");
            nota = sc.nextDouble();
            contador++;

            if(nota > maiornota){
                maiornota = nota;
            }
            if(nota < menornota){
                menornota = nota;
            }
        }
        System.out.println("A maior nota é: " + maiornota);
        System.out.println("A menor nota é: " + menornota);
    }
}

