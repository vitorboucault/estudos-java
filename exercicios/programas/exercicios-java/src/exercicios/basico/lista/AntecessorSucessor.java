package exercicios.basico.lista;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = ler.nextInt();
        valor = valor - 1;
        System.out.println("Antecessor: " + valor);
        valor = valor + 2;
        System.out.println("Sucessor: " + valor);
    }
}
