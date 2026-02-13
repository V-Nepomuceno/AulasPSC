package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int contadorH = 0;
        int contadorM = 0;
        String nome;
        double maiorAltura = 0;
        double menorAltura = 0;
        String nomemaior = "";
        String nomemenor = "";

        double alturaM = 0, alturaH = 0, altura = 0;
        int sexo = 0;

        while(contador <= 4){
            System.out.println("Digite o nome da pessoa:");
            nome = sc.next();
            System.out.println("Digite o gênero: 1 - Masculino ou 2 - Feminino");
            sexo = sc.nextInt();
            System.out.println("Informe sua altura:");
            altura = sc.nextDouble();

            if(sexo == 1){
                alturaH = alturaH + altura;
                contadorH++;
            }
            else if(sexo == 2){
                alturaM = alturaM + altura;
                contadorM++;
            }
            contador++;

            if(altura > maiorAltura){
                nomemaior = nome;
                maiorAltura = altura;
            }
            if(altura < menorAltura){
                nomemenor = nome;
                menorAltura = altura;
            }

        }

        System.out.println("A maior altura é: " + maiorAltura + " do " + nomemaior);
        System.out.println("A menor altura é: " + menorAltura + " do " + nomemenor);

        double mediaAtH = alturaH / contadorH;
        System.out.println("A média de altura dos homens é: " + mediaAtH);
        double mediaAtM = alturaM / contadorM;
        System.out.println("A média de altura das mulheres é: " + mediaAtM);
        double mediatotal = (alturaH + alturaM) / 4;
        System.out.println("A média de altura total é: " + mediatotal);
    }
}

