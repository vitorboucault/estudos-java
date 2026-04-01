package exercicios.basico.revisao;

import java.util.Scanner;

public class FatorialFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numero + "! = " + fatorial);

    }
}
