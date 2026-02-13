package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1, matricula = 0, matriculamaior = 0, matriculamaior2 = 0;
        double nota = 0, maiornota = 0, maiornota2 = 0;


        while(contador <= 3){
            System.out.println("Insira o nº da matricula do " + contador + "º aluno:");
            matricula = sc.nextInt();
            System.out.println("Insira a nota do " + contador + "º aluno:");
            nota = sc.nextInt();

            if(nota > maiornota){
                matriculamaior = matricula;
                maiornota = nota;
            }
            if(nota > maiornota2 & nota < maiornota){
                matriculamaior2 = matricula;
                maiornota2 = nota;
            }
            contador++;
        }
        System.out.println("A maior nota é: " + maiornota + " do aluno de matricula: " + matriculamaior);
        System.out.println("A segunda maior nota é: " + maiornota2 + " do aluno de matricula: " + matriculamaior2);
    }
}
