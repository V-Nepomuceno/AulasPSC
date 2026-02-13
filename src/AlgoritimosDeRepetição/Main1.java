package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aluno = 0;
        double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;

        System.out.println("Informe o número da matricula:");
        aluno = sc.nextInt();

        while( aluno >= 0){

            System.out.println("Informe a primeira nota:");
            nota1 = sc.nextDouble();
            System.out.println("Informe a segunda nota:");
            nota2 = sc.nextDouble();
            System.out.println("Informe a terceira nota");
            nota3 = sc.nextDouble();

            media = (nota1 + nota2 + nota3)/3;
            if(media >= 70){
                System.out.println("Aprovado!");
            }
            else if(media >= 60 & media < 70){
                System.out.println("Exame!");
            }
            else{
                System.out.println("Reprovado!");


            }
            System.out.println("Informe o número da matricula:");
            aluno = sc.nextInt();
        }
        if(aluno < 0){
            System.out.println("Programa encerrado!");
        }
    }
}
