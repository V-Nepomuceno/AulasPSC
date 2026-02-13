package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        double nota = 0;
        double notaMaior = 0, notaMenor = 100;

        while(contador <= 5){
            System.out.println("Informe a nota do " + contador + "º aluno: ");
            nota = sc.nextDouble();
            contador++;

            if(nota > notaMaior){
                notaMaior = nota;
            }
            if(nota < notaMenor){
                notaMenor = nota;
            }
        }
        System.out.println("A maior nota é: " + notaMaior);
        System.out.println("A menor nota é: " + notaMenor);
    }
}
