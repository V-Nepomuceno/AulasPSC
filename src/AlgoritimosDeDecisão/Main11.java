package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe X:");
        double x = sc.nextDouble();
        System.out.println("Informe Y:");
        double y = sc.nextDouble();
        System.out.println("Informe Z:");
        double z = sc.nextDouble();

        if ( x > y + z | y > x + z | z > x + y){
            System.out.println("Não é um triângulo");

        }
        else{
            System.out.println("É um triângulo  \n Tipo de triângulo :");

            if(x == y & x == z){
                System.out.println("Equilátero");
            }
            else if(x == z | x == y){
                System.out.println("Isósceles");
            }
            else{
                System.out.println("Escaleno");
            }

        }
    }
}

