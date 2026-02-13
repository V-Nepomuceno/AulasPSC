package POO;

import java.sql.SQLOutput;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de andares:");
        int totalandares = sc.nextInt();
        System.out.println("Informe a capacidade do elevador:");
        int capacidadeelevador = sc.nextInt();
        Elevador elevador = new Elevador(totalandares,capacidadeelevador);

        elevador.Entrar();
        elevador.Subir();
        elevador.Subir();
        elevador.Sair();
        elevador.Descer();
        elevador.Entrar();
        elevador.Entrar();
        elevador.Descer();
        elevador.Descer();
        elevador.Descer();
        elevador.Descer();
        elevador.Descer();
        elevador.Descer();
        elevador.Descer();
        elevador.Descer();
        elevador.Descer();

        System.out.println("O elevador tem " + elevador.getPessoas() + " pessoa(s)");
        System.out.println("Capacidade:" + elevador.getPessoas() + "/" + elevador.getCapacidade());
        System.out.println("Andar:" + elevador.getAndarAtual() + "/" + totalandares);



    }
}
