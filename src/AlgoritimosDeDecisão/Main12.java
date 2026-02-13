package AlgoritimosDeDecisão;

import java.util.Scanner;
public class Main12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hamburgueria UNA \n Cardápio: \n 1-Cachorro-quente \n 2-X-burguer \n 3-X-Bacon \n 4-X-UNA \n Informe o item:");
        int c = sc.nextInt();

        switch (c){
            case 1:
                System.out.println("Você escolheu: 'Cachorro quente'");
                break;
            case 2:
                System.out.println("Você escolheu: 'X-Burguer'");
                break;
            case 3:
                System.out.println("Você escolheu: 'X-Bacon'");
                break;
            case 4:
                System.out.println("Você escolheu: 'X-Una'");
                break;
            default:
                System.out.println("Item inválido.");
        }
    }
}

