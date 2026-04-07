package exercicios.basico.lista;

import java.util.Scanner;

public class SomaValores {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = ler.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int c = ler.nextInt();

        int somar = a + b;
        if (somar > c) System.out.println("O valor digitado foi maior");
        else System.out.println("O valor digitado foi menor");
    }
}
