package AlgoritimosDeRepetição;

import java.util.*;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;

        while(contador <= 20){
            System.out.println( contador + " Polegadas = " + contador/2.54 + "cm.");
            contador++;
        }
    }
}
