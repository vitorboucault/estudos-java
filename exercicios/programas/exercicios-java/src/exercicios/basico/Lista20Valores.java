package exercicios.basico;

import java.util.Scanner;

public class Lista20Valores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um valor: ");
        double valor = input.nextDouble();
        double menor = valor;

        for (int i = 1; i <= 19; i++) {
            System.out.println("Escreva um valor: ");
            valor = input.nextDouble();
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.println("Menor valor: " + menor);
    }
}
