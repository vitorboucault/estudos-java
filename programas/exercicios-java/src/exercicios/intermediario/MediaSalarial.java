package exercicios.intermediario;

import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int funcionarios = contador;


        do {
            System.out.println("Quantos funcionarios você tem?");
            funcionarios = entrada.nextInt();

            System.out.println("Quantos funcionarios você tem?");
            String finalizar = entrada.next();
        }while (String finalizar == "Sim");
    }
}
