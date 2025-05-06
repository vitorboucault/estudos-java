package exercicios.basico;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
            System.out.println("Programa encerrado.");
        }
    }
}
